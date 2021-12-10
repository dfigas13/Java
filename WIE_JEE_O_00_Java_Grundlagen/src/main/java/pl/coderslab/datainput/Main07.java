package pl.coderslab.datainput;

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {

    nettoBrutto();

    }

    public static void nettoBrutto() {
        System.out.println("Wenn du brutto berechnen möchtest drücke 'b' wenn netto drücke 'n'");
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        if(value.equals("b")) {
            bruttoValue();
        } else if (value.equals("n")) {
            nettoValue();
        }
    }

    public static void nettoValue() {
        /*Eingabe 810*/
        System.out.println("Brutto Wert: ");
        double value = 0;
        Scanner scanner = new Scanner(System.in);
        double val1 = scanner.nextDouble();
        value = val1 / 1.20;
        System.out.println("Netto: " + value);
    }

    public static void bruttoValue() {
        /*Eingabe 675*/
        System.out.println("Netto Wert: ");
        double value = 0;
        Scanner scanner = new Scanner(System.in);
        double val2 = scanner.nextDouble();
        value = val2 * 1.20;
            System.out.println("Brutto: " + value);

    }
}
