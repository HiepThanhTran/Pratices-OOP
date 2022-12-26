package bth2.exercise6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Factory {

    public static final SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
    public static final GregorianCalendar c = new GregorianCalendar();
    public static final Scanner sc = new Scanner(System.in);
    public static final int AMOUNT_SUBJECT = 3;
}
