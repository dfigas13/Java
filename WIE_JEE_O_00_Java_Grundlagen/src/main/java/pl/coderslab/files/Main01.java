package pl.coderslab.files;

import java.io.*;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Schreibe ein paar Worte in der Konsole: ");
        String line = sc.nextLine();
        String[] strSplit = line.split(" ");

        for (String item : strSplit) {
            if (item.equals("quit")) {
                System.exit(0);
            }
        }

        try (FileWriter fileWriter = new FileWriter("text1.txt", true)) {
            fileWriter.append(line);
        } catch (IOException e) {
            System.out.println("Error writing in the file");
        }


    }
}
