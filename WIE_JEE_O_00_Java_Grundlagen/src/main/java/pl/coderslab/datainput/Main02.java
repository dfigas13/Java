package pl.coderslab.datainput;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        operations();
    }

    public static void operations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Zahl 2 : ");
        int num2 = scanner.nextInt();

        int result1 = num1 + num2;
        System.out.println("Addition: " + result1);
        int result2 = num1 - num2;
        System.out.println("Subtraktion: " + result2);
        int result3 = num1 * num2;
        System.out.println("Multiplikation: " + result3);
        int result4 = num1 / num2;
        System.out.println("Division: " + result4);

    }
}
