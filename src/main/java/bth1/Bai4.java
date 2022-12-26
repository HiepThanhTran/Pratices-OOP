package bth1;

import app.App;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App.printLine(100);
        System.out.print("- Nhập số nguyên n: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("- Nhập arr[" + i + "]: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        App.printLine(100);
        while (true) {
            System.out.println("\n1- Tính tổng các số nguyên tố trong mảng");
            System.out.println("\n2- Tìm số nguyên dương lớn nhất và số nguyên âm nhỏ nhất (Không có in ra *)");
            System.out.println("\n3- Tìm số nguyên tố nhỏ nhất trong mảng");
            System.out.println("\n4- Sắp xếp các số nguyên tố, các số khác giữ nguyên");
            System.out.println("\n5- Nhập x, tìm x bằng tìm kiếm nhị phân");
            System.out.println("\n6- Thoát chương trình");
            System.out.print("\n- Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    App.printLine(100);
                    System.out.println("- Tổng các số nguyên tố: " + sumOfPrime(arr));
                    App.printLine(100);
                    break;
                }
                case 2: {
                    String[] s = find(arr);
                    App.printLine(100);
                    System.out.println("- Số nguyên dương lớn nhất: " + s[0]);
                    System.out.println("- Số nguyên âm nhỏ nhất: " + s[1]);
                    App.printLine(100);
                    break;
                }
                case 3: {
                    App.printLine(100);
                    System.out.printf("- Số nguyên tố nhỏ nhất là: %d\n", minPrime(arr));
                    App.printLine(100);
                    break;
                }
                case 4: {
                    App.printLine(100);
//                    sortPrime(arr);
                    output1D(arr);
                    App.printLine(100);
                    break;
                }
                case 5: {
                    App.printLine(100);
                    System.out.print("- Nhập số nguyên x cần tìm: ");
                    int x = Integer.parseInt(sc.nextLine());
                    int i = binarySearch(arr, x);
                    if (i == -1) {
                        System.out.printf("- Không tìm thấy %d\n", x);
                    } else {
                        output1D(arr);
                        System.out.printf("- Số %d ở vị trí arr[%d]\n", x, i);
                    }
                    App.printLine(100);
                    break;
                }
                case 6:
                    return;
                default:
                    System.out.println("\n== KHÔNG HỢP LỆ ==");
            }
            sc.nextLine();
        }
    }

    public static void output1D(int[] arr) {
        IntStream.of(arr).forEach(x -> System.out.println(x + " "));
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrime(int[] arr) {
        return IntStream.of(arr).filter(x -> isPrime(x)).sum();
    }

    public static String[] find(int[] arr) {
        String[] s = {"*", "*"}; // s[0] nguyên dương, s[1] nguyên âm
        int[] tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tmp);
        if (tmp[tmp.length - 1] > 0) {
            s[0] = tmp[tmp.length - 1] + "";
        }
        if (tmp[0] < 0) {
            s[1] = tmp[0] + "";
        }
        return s;
    }

    public static int minPrime(int[] arr) {
        return IntStream.of(arr).filter(x -> isPrime(x)).min().getAsInt();
    }

//    public static void sortPrime(int[] arr) {
//        Arrays.sort(arr, (a1, a2) -> isPrime((Integer) a1) && isPrime((Integer) a2) && a1 > a2 ? -1 : 1);
//    }

    public static int binarySearch(int[] arr, int x) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, x);
    }
}