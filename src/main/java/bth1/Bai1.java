package bth1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int randomNumber = (int) (Math.random() * 100);
            while (true) {
                System.out.print("\n- Enter your number: ");
                int guessNumber = sc.nextInt();
                if (guessNumber < randomNumber) {
                    System.out.println("\nHigher");
                } else if (guessNumber > randomNumber) {
                    System.out.println("\nLower");
                } else {
                    System.out.println("\nCorrect");
                    break;
                }
            }
        }
    }
}