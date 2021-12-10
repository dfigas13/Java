package pl.coderslab.files;

import java.io.*;
import java.util.Scanner;


public class Main04 {

    public static void main(String[] args) {

        File file = new File("text4.txt");
        StringBuilder stringBuilder = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println(stringBuilder.toString());
        System.out.println();


        /*String[] strSplit = stringBuilder.toString().split("\n");
        System.out.println(strSplit.length);*/
        String[] splitSplit = stringBuilder.toString().split(" ");
        System.out.println(splitSplit.length);


        for (String s : splitSplit) {
            if (s.equalsIgnoreCase("Javy") || s.equalsIgnoreCase("Javy,")) {
                /*stringBuilder.();*/
                System.out.println("YES");

            }
        }





    }
}
