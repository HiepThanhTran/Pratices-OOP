package bth2.exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import bth2.exercise4.Fraction;

public class FractionList {

    private static final Scanner sc = new Scanner(System.in);
    private ArrayList<Fraction> fractions;

    public FractionList() {
        fractions = new ArrayList<>();
    }

    public void addFraction(Fraction op) {
        this.fractions.add(op);
    }

    public void addFraction() {
        System.out.print("- Nhập tử và mẫu phân số: ");
        int t = sc.nextInt(), m = sc.nextInt();
        Fraction p = new Fraction(t, m);
        this.fractions.add(p);
    }

    public void removeFraction(Fraction op) {
        if (fractions.contains(op)) {
            fractions.remove(op);
            System.out.println("\n** XÓA PHÂN SỐ THÀNH CÔNG **");
        }
    }

    public Fraction sumOfFractions() {
        Fraction res = new Fraction();
        for (Fraction op : fractions) {
            res = res.add(op);
        }
        return res;
    }

    public void sortFractionList() {
        Collections.sort(fractions);
    }

    @Override
    public String toString() {
        return String.valueOf(fractions);
    }
}
