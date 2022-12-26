package bth1;

import app.App;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App.printLine(100);
        System.out.println("** NHẬP DỮ LIỆU CHO MA TRẬN **");
        System.out.print("- Nhập số dòng: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.print("- Nhập số cột: ");
        int cols = Integer.parseInt(sc.nextLine());
        int[][] arr = input(rows, cols);
        System.out.println("\n- Ma trận đang lưu trữ: ");
        output2D(arr);
        int[] sumOfRows = calcSumOfRows(arr);
        int[] sumOfCols = calcSumOfCols(arr);
        App.printLine(100);
        while (true) {
            System.out.println("1- Tính tổng trên từng dòng và từng cột");
            System.out.println("\n2- Tìm dòng có tổng lớn nhất và cột có tổng nhỏ nhất");
            System.out.println("\n3- Tính tổng và tìm giá trị nhỏ nhất trên dòng thứ i");
            System.out.println("\n4- Tính tổng và tìm giá trị lớn nhất trên cột thứ j");
            System.out.println("\n5- Thoát chương trình");
            System.out.print("\n- Chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    App.printLine(100);
                    System.out.print("** TỔNG CÁC DÒNG TRONG MA TRẬN **");
                    output1D(sumOfRows, "dòng");
                    System.out.print("\n** TỔNG CÁC CỘT TRONG MA TRẬN **");
                    output1D(sumOfCols, "cột");
                    App.printLine(100);
                    break;
                }
                case "2": {
                    App.printLine(100);
                    System.out.println("- Dòng có tổng lớn nhất: " + (findRowWithMaxSum(sumOfRows) + 1));
                    System.out.println("- Cột có tổng nhỏ nhất: " + (findColWithMinSum(sumOfCols) + 1));
                    App.printLine(100);
                    break;
                }
                case "3": {
                    App.printLine(100);
                    System.out.print("- Nhập dòng thứ i: ");
                    int i = Integer.parseInt(sc.nextLine());
                    System.out.println("\n- Tổng dòng thứ " + i + " = " + sumOfRows[i - 1]);
                    System.out.println("- Giá trị nhỏ nhất trên dòng thứ " + i + ": " + minValueOfRow(arr, i - 1));
                    App.printLine(100);
                    break;
                }
                case "4": {
                    App.printLine(100);
                    System.out.print("- Nhập cột thứ j: ");
                    int j = Integer.parseInt(sc.nextLine());
                    System.out.println("\n- Tổng cột thứ " + j + " = " + sumOfCols[j - 1]);
                    System.out.println("- Giá trị lớn nhất trên cột thứ " + j + ": " + maxValueOfCol(arr, j - 1));
                    App.printLine(100);
                    break;
                }
                case "5":
                    return;
                default:
                    System.out.println("\n== KHÔNG HỢP LỆ ==");
            }
            sc.nextLine();
        }
    }

    public static int[][] input(int m, int n) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) Math.random() * 100 + 1;
            }
        }
        return a;
    }

    public static void output2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%6d", arr[i][j]);
            }
            if (i != arr.length - 1) {
                System.out.println("\n");
            } else {
                System.out.println();
            }
        }
    }

    public static void output1D(int[] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n- Tổng " + s + " thứ " + (i + 1) + " = " + arr[i]);
        }
    }

    public static int[] calcSumOfRows(int[][] arr) {
        int[] sumOfRows = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sumOfRows[i] = IntStream.of(arr[i]).sum();
        }
        return sumOfRows;
    }

    public static int[] calcSumOfCols(int[][] arr) {
        int[] sumOfCols = new int[arr[0].length];
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            sumOfCols[j] = sum;
        }
        return sumOfCols;
    }

    public static int findRowWithMaxSum(int[] arr) {
        return IntStream.of(arr).max().getAsInt();
    }

    public static int findColWithMinSum(int[] arr) {
        return IntStream.of(arr).max().getAsInt();
    }

    public static int minValueOfRow(int[][] arr, int i) {
        return IntStream.of(arr[i]).min().getAsInt();
    }

    public static int maxValueOfCol(int[][] arr, int j) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i][j];
        }
        return IntStream.of(tmp).max().getAsInt();
    }
}