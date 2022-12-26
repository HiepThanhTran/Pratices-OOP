package bth3.exercise4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Account {

    protected static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    protected static final GregorianCalendar c = new GregorianCalendar();
    private static int id = 0;
    protected String accountNumber;
    protected Calendar accountCreDate;
    protected String accountName;
    protected String email;
    protected String phoneNumber;
    protected double money;

    {
        id++;
        accountNumber = String.format("%06d", id);
        accountCreDate = new GregorianCalendar();
    }

    public Account(String accountName, String email, String phoneNumber, double money) {
        this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Calendar getAccountCreDate() {
        return accountCreDate;
    }

    public void setAccountCreDate(Calendar accountCreDate) {
        this.accountCreDate = accountCreDate;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void deposit(double money) {
        if (this.isDateDue()) {
            this.money += money;
        }
    }

    public void withdraw(double money) {
        if (this.money > 0) {
            this.money -= money;
        }
    }

    public boolean isDateDue() {
        return true;
    }

    public void calculate() {
        this.money = this.money + this.money * Term.DEMAND.getRate();
    }

    @Override
    public String toString() {
        DecimalFormat dcf = new DecimalFormat("###,###.##");
        return String.format(
            "\nSố tài khoản: %s"
                + "\nTên tài khoản: %s"
                + "\nSố tiền: %s"
                + "\nEmail: %s"
                + "\nSố điện thoại: %s"
                + "\nNgày tạo tài khoản: %s", accountNumber, accountName, dcf.format(money), email, phoneNumber,
            f.format(accountCreDate.getTime()));
    }
}
