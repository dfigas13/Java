package pl.coderslab.datainput;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        rowsColumns();

    }

    public static void rowsColumns() {
        int[] resultArray = new int[2];
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = scanner.nextInt();
        resultArray[0] = rows;

        System.out.println("Column: ");
        int cols = scanner.nextInt();
        resultArray[1] = cols;

        for (int item : resultArray) {
            result += item;
        }
        System.out.println("Summe: " + result);
        System.out.println("Durschnitt: " + result /resultArray.length);


    }
}
