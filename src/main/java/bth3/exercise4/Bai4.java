package bth3.exercise4;

import java.text.ParseException;

public class Bai4 {

    public static void main(String[] args) throws ParseException {
        Account t1 = new Account("Tran Thanh Hiep", "2151050469hiep@ou.edu.vn", "0388227064", 1000000);
        Account t2 = new TermAccount("Tong Thi Thu Hien", "2151050126hien@ou.edu.vn", "0377061609", 2000000, Term.ONE_MONTH);

        System.out.println(t1);
        System.out.println(t2);
//        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
//        AccountManagement accountManagement = new AccountManagement();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("\n== HỆ THỐNG QUẢN LÝ TÀI KHOẢN NGÂN HÀNG ==");
//            System.out.println("\n1- Tạo tài khoản mới");
//            System.out.println("\n2- Xem thông tin tài khoản");
//            System.out.println("\n3- Tính tiền lãi khi đến ngày đáo hạn");
//            System.out.println("\n4- Nộp tiền vào tài khoản");
//            System.out.println("\n5- Rút tiền khỏi tài khoản");
//            System.out.println("\n6- Cập nhật ngày đáo hạn");
//            System.out.println("\n7- Thoát chương trình");
//            System.out.print("\n- Chọn chức năng: ");
//            String choice = sc.nextLine();
//            switch (choice) {
//                case "1": {
//                    App.printLine(100);
//                    System.out.print("- Nhập tên tài khoản: ");
//                    String accountName = sc.nextLine();
//                    System.out.print("- Nhập email: ");
//                    String email = sc.nextLine();
//                    System.out.print("- Nhập số điện thoại: ");
//                    String phoneNumber = sc.nextLine();
//                    System.out.print("- Số tiền muốn gửi (tối thiểu 50.000): ");
//                    double money = Double.parseDouble(sc.nextLine());
//                    System.out.println("\n1- Tài khoản không kỳ hạn");
//                    System.out.println("\n2- Tài khoản có kỳ hạn");
//                    System.out.print("\n- Chọn loại tài khoản: ");
//                    String c1 = sc.nextLine();
//                    switch (c1) {
//                        case "1": {
//                            Account account = new Account(accountName, email, phoneNumber, money);
//                            accountManagement.addAccount(account);
//                            System.out.println("\n== THÊM TÀI KHOẢN THÀNH CÔNG ==");
//                            break;
//                        }
//                        case "2": {
//                            System.out.println("\n1- Kỳ hạn 1 tuần");
//                            System.out.println("\n2- Kỳ hạn 1 tháng");
//                            System.out.println("\n3- Kỳ hạn 1 năm");
//                            System.out.print("\n- Chọn kỳ hạn: ");
//                            String c1c2 = sc.nextLine();
//                            if (c1c2.matches("[1-3]")) {
//                                int index = Integer.parseInt(c1c2);
//                                TermAccount account = new TermAccount(accountName, email, phoneNumber, money, index);
//                                accountManagement.addAccount(account);
//                                System.out.println("\n== THÊM TÀI KHOẢN THÀNH CÔNG ==");
//                            }
//                            break;
//                        }
//                        default:
//                            System.out.println("\n== KHÔNG HỢP LỆ ==");
//                    }
//                    App.printLine(100);
//                    break;
//                }
//                case "2": {
//                    App.printLine(100);
//                    System.out.print("- Nhập số tài khoản hoặc tên tài khoản: ");
//                    String s = sc.nextLine();
//                    Account account = accountManagement.searchAccount(s);
//                    if (account != null) {
//                        System.out.println("\n== THÔNG TIN TÀI KHOẢN ==");
//                        System.out.println(account);
//                    } else {
//                        System.out.println("\n== KHÔNG TÌM THẤY TÀI KHOẢN ==");
//                    }
//                    App.printLine(100);
//                    break;
//                }
//                case "3": {
//                    App.printLine(100);
//                    System.out.print("- Nhập số tài khoản hoặc tên tài khoản: ");
//                    String s = sc.nextLine();
//                    Account account = accountManagement.searchAccount(s);
//                    if (account != null && accountManagement.isCalculate(account)) {
//                        System.out.println("\n== TÀI KHOẢN SAU KHI TÍNH LÃI ĐÁO HẠN ==");
//                        System.out.println(account);
//                    } else {
//                        System.out.println("\n== TÍNH TIỀN LÃI KHÔNG THÀNH CÔNG ==");
//                    }
//                    App.printLine(100);
//                    break;
//                }
//                case "4": {
//                    App.printLine(100);
//                    System.out.print("- Nhập số tài khoản hoặc tên tài khoản: ");
//                    String s = sc.nextLine();
//                    System.out.print("- Nhập số tiền cần nộp vào tài khoản (Bội của 50.000): ");
//                    double money = Double.parseDouble(sc.nextLine());
//                    Account account = accountManagement.searchAccount(s);
//                    if (account != null && accountManagement.isDeposit(account, money)) {
//                        System.out.println("\n== NỘP TIỀN THÀNH CÔNG ==");
//                        System.out.println(account);
//                    } else {
//                        System.out.println("\n== NỘP TIỀN KHÔNG THÀNH CÔNG ==");
//                    }
//                    App.printLine(100);
//                    break;
//                }
//                case "5": {
//                    App.printLine(100);
//                    System.out.print("- Nhập số tài khoản hoặc tên tài khoản: ");
//                    String s = sc.nextLine();
//                    System.out.print("- Nhập số tiền cần rút: ");
//                    double money = Double.parseDouble(sc.nextLine());
//                    Account account = accountManagement.searchAccount(s);
//                    if (account != null && accountManagement.isWithdraw(account, money)) {
//                        System.out.println("\n== RÚT TIỀN THÀNH CÔNG ==");
//                        System.out.println(account);
//                    } else {
//                        System.out.println("\n== RÚT TIỀN KHÔNG THÀNH CÔNG ==");
//                    }
//                    App.printLine(100);
//                    break;
//                }
//                case "6": {
//                    App.printLine(100);
//                    System.out.print("- Nhập số tài khoản hoặc tên tài khoản: ");
//                    String s = sc.nextLine();
//                    Account account = accountManagement.searchAccount(s);
//                    if (account != null && accountManagement.isTermBankAccount(account)) {
//                        System.out.print("- Nhập ngày đáo hạn mới (dd/MM/yyyy): ");
//                        String date = sc.nextLine();
//                        ((TermAccount) account).setDateDue(f.parse(date));
//                        System.out.println("\n== CẬP NHẬT THÀNH CÔNG ==");
//                    } else {
//                        System.out.println("\n== CẬP NHẬT THẤT BẠI ==");
//                    }
//                    App.printLine(100);
//                    break;
//                }
//                case "7":
//                    return;
//                default:
//                    System.out.println("\n== KHÔNG HỢP LỆ. NHẬP LẠI! ==");
//            }
//            sc.nextLine();
//        }
    }
}
