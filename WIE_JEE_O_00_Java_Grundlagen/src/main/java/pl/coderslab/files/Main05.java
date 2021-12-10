package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        File file = new File("text5.txt");
        StringBuilder stringBuilder = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + ", ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println(stringBuilder.toString());

        String[] line = stringBuilder.toString().split(", ");
        Arrays.sort(line);
        System.out.println("SORTED ARRAY: " + Arrays.toString(line));


    }
}
