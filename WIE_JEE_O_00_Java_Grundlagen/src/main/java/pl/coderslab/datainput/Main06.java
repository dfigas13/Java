package pl.coderslab.datainput;

import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {

    equation();
    }

    public static void equation() {
        int howManyResult = 0;
        int result = 0;
        int result2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl 1: ");
        int a = scanner.nextInt();
        System.out.println("Zahl 2: ");
        int b = scanner.nextInt();
        System.out.println("Zahl 3:");
        int c = scanner.nextInt();

        howManyResult = (int) (Math.pow(b, 2) - (4 * a * c));

        if(howManyResult > 0) {
            /*Angaben a = 1 b = -3 c = -10*/
            System.out.println("2 Lösungen");
            result = (int) (-b -  (Math.sqrt(howManyResult))) / (2 * a);
            result2 = (int) (-b +  (Math.sqrt(howManyResult))) / (2 * a);
            System.out.println("Erste Lösung: " + result);
            System.out.println("Zweite Lösung: " + result2);

        } else if (howManyResult == 0) {
            /*Angaben a = 1 b = 22 c = 121*/
            System.out.println("1 Lösung");
            result = (int) (-b +  (Math.sqrt(howManyResult))) / (2 * a);
            System.out.println("Result: " + result);

        } else if(howManyResult < 0) {
            System.out.println("Keine Lösung");
        }

    }

}
