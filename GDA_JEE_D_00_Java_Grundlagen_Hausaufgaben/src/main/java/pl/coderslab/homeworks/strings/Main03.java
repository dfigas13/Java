package pl.coderslab.homeworks.strings;


import java.util.Locale;

public class Main03 {

    public static void main(String[] args) {
        String str = "Marika";

        System.out.println(upperCase(str, 2));

    }

    public static String upperCase(String str, int index) {
        String[] str2 = str.split("");
        String upperText = "";

        for (int i = 0; i < str2.length; i++) {
            if (i % index == 0) {
                System.out.print(str2[i].toUpperCase());
            } else {
                System.out.print( str2[i] = str2[i].toLowerCase());
            }
        }
        return upperText;
    }

}
