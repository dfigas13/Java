package pl.coderslab.datainput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        getInfo();

    }
    public static void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißt du? : ");
        String name = scanner.next();
        System.out.println("Wie alt bist du? : ");
        int age = scanner.nextInt();
        System.out.println(name + " ist " + age + " Jahre alt");
    }
}
