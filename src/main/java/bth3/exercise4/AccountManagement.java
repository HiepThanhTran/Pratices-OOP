package bth3.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement {

    private static final Scanner sc = new Scanner(System.in);
    private List<Account> accounts;

    public AccountManagement() {
        accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    /**
     * Tìm kiếm tài khoản theo "tên tài khoản" hoặc "số tài khoản"
     *
     * @param key Tên tài khoản hoặc số tài khoản
     * @return
     */
    public Account searchAccount(String key) {
        return this.accounts.stream()
            .filter(account -> account.getAccountName().equals(key) || account.getAccountNumber().equals(key)).findFirst()
            .orElse(null);
    }

    /**
     * Kiểm tra tài khoản có phải là tài khoản kỳ hạn hay không
     *
     * @param account Tài khoản ngân hàng
     * @return
     */
    public boolean isTermBankAccount(Account account) {
        TermAccount termAccount = (TermAccount) account;
        return account instanceof TermAccount && termAccount.getDateDue() != null;
    }

    /**
     * Tính tiền khi đến ngày đáo hạn
     *
     * @param account Tài khoản ngân hàng
     * @return
     */
    public boolean isCalculate(Account account) {
        TermAccount termAccount = (TermAccount) account;
        double rate = Term.DEMAND.getRate();
        if (isTermBankAccount(account)) {
            if (!termAccount.isDateDue()) {
                return false;
            }
            rate = termAccount.getInfoDue().getRate();
            termAccount.setDateDue(null);
        }
        account.setMoney(account.getMoney() + account.getMoney() * rate);
        return true;
    }

    /**
     * Phương thức gửi tiền vào tài khoản
     *
     * @param account Tài khoản ngân hàng
     * @param money   Số tiền cần gửi
     * @return
     */
    public boolean isDeposit(Account account, double money) {
        TermAccount termAccount = (TermAccount) account;
        if (isTermBankAccount(account) && !termAccount.isDateDue()) {
            return false;
        }
        account.setMoney(account.getMoney() + money);
        return true;
    }

    /**
     * Phương thức rút tiền ra khỏi tài khoản
     *
     * @param account Tài khoản ngân hàng
     * @param money   Số tiền cần rút
     * @return
     */
    public boolean isWithdraw(Account account, double money) {
        TermAccount termAccount = (TermAccount) account;
        if (isTermBankAccount(account) && !termAccount.isDateDue()) {
            System.out.println("\n== CẢNH BÁO TÀI KHOẢN CHƯA ĐẾN NGÀY ĐÁO HẠN ==");
            System.out.println("TIẾP TỤC CÓ THỂ KHIẾN TÀI KHOẢN BỊ TẤT TOÁN");
            System.out.print("Tiếp tục (Y) / Hủy bỏ (N)? ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                account.setMoney(account.getMoney() - money);
                termAccount.setInfoDue(Term.DEMAND);
                termAccount.setDateDue(null);
                return true;
            }
            return false;
        }
        account.setMoney(account.getMoney() - money);
        return true;
    }
}
