package pl.coderslab.homeworks.datainput;


import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        printTriangle();
    }

    public static void printTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe ein zahl: ");
        int userNumber = scanner.nextInt();

        for(int i = 0; i <= userNumber; i++) {
            for (int j = 0 ; j < i ; j++) {
                    System.out.print("X");
            }
            System.out.println();
        }

    }

}
