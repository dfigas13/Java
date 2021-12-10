package pl.coderslab.cutstrings;

public class Main04 {

    public static void main(String[] args) {
        String str = "Java-Aufgaben-Teilung-Zeichenfolgen";

        System.out.println(onlyTwoElements(str, '-'));

    }
    public static String[] onlyTwoElements(String str, char separator) {

        String[] parts = new String[2];

        for(int i = str.length() -1; i >= 0; i--) {
            if (str.charAt(i) == separator) {

                String string1 = (str.substring(0, i));
                String string2 = (str.substring(i, str.length() - 1));

                parts[0] = string1;
                parts[1] = string2;


            }
        }
        System.out.println("Part 1: " + parts[0]);
        System.out.println("Part 2: " + parts[1]);


        return parts;
    }


}
