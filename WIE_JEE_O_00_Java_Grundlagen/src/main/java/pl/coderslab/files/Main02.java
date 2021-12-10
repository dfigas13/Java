package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        File file = new File("text1.txt");
        StringBuilder reading = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                reading.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println(reading.toString());


    }
}
