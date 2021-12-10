package pl.coderslab.datainput;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        textLines();
    }

    public static void textLines() {
        String[] arrName = new String[5];
        System.out.println("Wenn du beginnen möchtest drücke 'Enter', wenn nicht schreibe 'quit");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("quit")) {
            System.exit(0);
        }

        for (int i = 0; i < arrName.length; i++) {
            System.out.println("Schreibe einen Namen: ");
            arrName[i] = sc.nextLine();
        }

        for (String name : arrName) {
            System.out.println("Hallo " + name);
        }


    }
}
