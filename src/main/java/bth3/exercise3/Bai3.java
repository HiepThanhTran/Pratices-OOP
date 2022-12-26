package bth3.exercise3;

import app.App;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagement managerProduct = new ProductManagement();
        String book = "Sách";
        String disk = "Băng đĩa";
        while (true) {
            System.out.println("\n1- Thêm sản phẩm");
            System.out.println("\n2- Xóa sản phẩm");
            System.out.println("\n3- Cập nhật thông tin sản phẩm");
            System.out.println("\n4- Tìm kiếm sản phẩm");
            System.out.println("\n5- Sắp xếp danh sách giảm dần theo giá");
            System.out.println("\n6- Xem danh sách");
            System.out.println("\n7- Thoát chương trình");
            System.out.print("\n- Chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    App.printLine(100);
                    System.out.println("== NHẬP THÔNG TIN SẢN PHẨM ==");
                    System.out.print("\n- Nhập mã sản phẩm: ");
                    String id = sc.nextLine();
                    System.out.print("\n- Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("\n- Nhập mô tả sản phâm: ");
                    String desc = sc.nextLine();
                    System.out.print("\n- Nhập nhà sản xuất: ");
                    String producer = sc.nextLine();
                    System.out.print("\n- Nhập giá sản phâm: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.println("\n1- Sản phẩm sách");
                    System.out.println("\n2- Sản phẩm băng đĩa");
                    System.out.print("\n- Chọn sản phẩm muốn thêm: ");
                    String c1 = sc.nextLine();
                    if (c1.equals("1")) {
                        System.out.print("\n- Nhập số trang sách: ");
                        int page = Integer.parseInt(sc.nextLine());
                        Book newBook = new Book(id, name, desc, producer, price, page);
                        managerProduct.addProduct(newBook);
                    } else if (c1.equals("2")) {
                        System.out.print("\n- Nhập độ dài thời gian phát: ");
                        String time = sc.nextLine();
                        Disk newDisk = new Disk(id, name, desc, producer, price, time);
                        managerProduct.addProduct(newDisk);
                    } else {
                        System.out.println("\n== SẢN PHẨM KHÔNG TỒN TẠI ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "2": {
                    App.printLine(100);
                    System.out.print("- Nhập mã sản phẩm cần xóa: ");
                    String id = sc.nextLine();
                    if (managerProduct.removeProduct(id)) {
                        System.out.println("\n== XÓA THÀNH CÔNG ==");
                    } else {
                        System.out.println("\n== KHÔNG TÌM THẤY SẢN PHẨM ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "3": {
                    App.printLine(100);
                    System.out.println("- Nhập mã sản phẩm cần cập nhât: ");
                    String id = sc.nextLine();
                    Product other = managerProduct.search(id);
                    if (other != null) {
                        System.out.println("\n== CẬP NHẬT THÔNG TIN SẢN PHẨM ==");
                        System.out.println("\n1- Tên sản phẩm");
                        System.out.println("\n2- Mô tả sản phẩm");
                        System.out.println("\n3- Giá bán");
                        System.out.println("\n4- Quay lại");
                        System.out.print("\n- Nhập lựa chọn: ");
                        String c3 = sc.nextLine();
                        switch (c3) {
                            case "1": {
                                System.out.print("\n- Nhập tên mới: ");
                                String name = sc.nextLine();
                                other.setName(name);
                                break;
                            }
                            case "2": {
                                System.out.print("\n- Nhập mô tả mới: ");
                                String desc = sc.nextLine();
                                other.setName(desc);
                                break;
                            }
                            case "3": {
                                System.out.print("\n- Nhập giá bán mới: ");
                                String price = sc.nextLine();
                                other.setName(price);
                                break;
                            }
                            case "4":
                                break;
                            default:
                                System.out.println("\n== KHÔNG HỢP LỆ ==");
                        }
                    } else {
                        System.out.println("\n== KHÔNG TÌM THẤY SẢN PHẨM ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "4": {
                    App.printLine(100);
                    System.out.print("- Nhập từ khóa cần tìm (mã, tên, mô tả, nhà sản xuất): ");
                    String s = sc.nextLine();
                    Product other = managerProduct.search(s);
                    if (other != null) {
                        System.out.println("\n== THÔNG TIN SẢN PHẨM CẦN TÌM ==");
                        System.out.println(other.toString());
                    } else {
                        System.out.println("\n== KHÔNG TÌM THẤY SẢN PHẨM ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "5": {
                    App.printLine(100);
                    managerProduct.sortList();
                    System.out.println("\n== HIỂN THỊ DANH SÁCH ĐỂ KIỂM TRA ==");
                    App.printLine(100);
                    break;
                }
                case "6": {
                    App.printLine(100);
                    managerProduct.showList();
                    App.printLine(100);
                    break;
                }
                case "7":
                    return;
                default:
                    System.out.println("\n== KHÔNG HỢP LỆ ==");
            }
        }
    }
}
