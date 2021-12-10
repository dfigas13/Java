package pl.coderslab.datainput;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        getData();

    }

    public static void getData() {
        System.out.print("Geben Sie eine ganze Zahl ein: ");
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
                result += scanner.nextInt();
                System.out.println("Result: " + result);
        }
       /* if (scanner.hasNextInt()&& scanner.nextInt() != 0 ) {
            System.exit(0);
        }*/


    }
}
