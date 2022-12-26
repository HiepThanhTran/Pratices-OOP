package bth1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\n- Enter integer n: ");
            int n = sc.nextInt();
            int[] polynomial = new int[n + 1];
            for (int i = n; i >= 0; i--) {
                System.out.print("\n- Enter integer x^" + i + ": ");
                polynomial[i] = sc.nextInt();
            }
            System.out.print("\n- Enter integer x: ");
            int x = sc.nextInt(), fx = 0;
            for (int i = n; i > 0; i--) {
                fx += polynomial[i] * Math.pow(x, i);
            }
            fx += polynomial[0];
            System.out.println("\n- F(" + x + ") = " + fx);
        }
    }
}