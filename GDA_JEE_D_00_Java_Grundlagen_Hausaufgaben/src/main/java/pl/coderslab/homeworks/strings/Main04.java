package pl.coderslab.homeworks.strings;


import java.util.Objects;

public class Main04 {

    public static void main(String[] args) {
        String str = "qazbbbwsx";
        String str2 = "aaawsxbbb";

        System.out.println(triple(str));
//        System.out.println(triple(str2));

    }


    public static int triple(String str) {
       /* String[] str2 = str.split("");*/

        int result = 0;
        for (int i = 0; i < str.length(); i++) {

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result++;
                }
            }
        }
        return result;
    }
}
