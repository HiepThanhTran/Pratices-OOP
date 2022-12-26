package bth1;

import app.App;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1- Nhập địa chỉ email và xuất ra tên địa chỉ");
                System.out.println("\n2- Nhập vào chuỗi bất kỳ và in ra số lượng ký tự in hoa");
                System.out.println("\n3- Đọc file và thay thế các từ \"file\" thành \"tập tin\"");
                System.out.println("\n4- Đếm số từ và tìm từ dài nhất trong chuỗi bất kỳ");
                System.out.println("\n5- Chuẩn hóa chuỗi");
                System.out.println("\n6- Thoát chương trình");
                System.out.print("\n- Chọn chức năng: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1: {
                        System.out.print("\n- Nhập địa chỉ email: ");
                        String email = sc.nextLine();
                        App.printLine(100);
                        System.out.println("- Tên địa chỉ là: " + emailName(email));
                        App.printLine(100);
                        break;
                    }
                    case 2: {
                        System.out.print("\n- Nhập chuỗi bất kỳ: ");
                        String s = sc.nextLine();
                        App.printLine(100);
                        System.out.println("- Số lượng ký tự in hoa: " + countUpperCase(s));
                        App.printLine(100);
                        break;
                    }
                    case 3: {
                        readFileAndReplace();
                        break;
                    }
                    case 4: {
                        System.out.print("\n- Nhập chuỗi bất kỳ: ");
                        String s = sc.nextLine();
                        String[] arrayOfStrings = arrayOfStrings(s);
                        App.printLine(100);
                        System.out.println("- Số từ trong chuỗi trên là: " + arrayOfStrings.length);
                        System.out.println("- Từ dài nhất trong chuỗi trên là: " + longestWord(arrayOfStrings));
                        App.printLine(100);
                        break;
                    }
                    case 5: {
                        System.out.print("\n- Nhập chuỗi bất kỳ: ");
                        String s = sc.nextLine();
                        App.printLine(100);
                        System.out.println("- Chuỗi sau khi chuẩn hóa: " + standardize(s));
                        App.printLine(100);
                        break;
                    }
                    case 6:
                        return;
                    default:
                        System.out.println("\n== KHÔNG HỢP LỆ ==");
                }
            }
        }
    }

    public static String emailName(String email) {
        return email.substring(0, email.indexOf("@"));
    }

    public static int countUpperCase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void readFileAndReplace() throws FileNotFoundException {
        String document = null;
        String textReplace = "tập tin";
        File f = new File("src/main/resources/Input.txt");
        Scanner read = new Scanner(f);
        document = read.nextLine().replaceAll("\\{file}", textReplace);
        read.close();

        f = new File("src/main/resources/Output.txt");
        PrintWriter writer = new PrintWriter(f);
        writer.println(document);
        writer.close();

        System.out.println("\n== THAY THẾ THÀNH CÔNG ==");
    }

    public static String[] arrayOfStrings(String s) {
        return s.trim().split("[\\s,;]+");
    }

    public static String longestWord(String[] arrayOfStrings) {
        String word = arrayOfStrings[0];
        for (int i = 1; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].length() > word.length()) {
                word = arrayOfStrings[i];
            }
        }
        return word;
    }

    public static String standardize(String s) {
        String[] tmp = s.trim().toLowerCase().split("[\\s,;]+");
        String st = "";
        for (int i = 0; i < tmp.length; i++) {
            st += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
            if (i != tmp.length - 1) {
                st += " ";
            }
        }
        return st;
    }
}