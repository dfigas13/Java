package pl.coderslab.strings;

public class Main01 {

    public static void main(String[] args) {

        String str = "CodersLab a good start in programming";
        System.out.println(letterInString(str));

    }

    public static int letterInString(String str) {
        int counter = 0;
        char actualValue = str.charAt(str.length() - 2);
        char[] c_arr = str.toCharArray();

        for (char c : c_arr) {
            if (c == actualValue) {
                counter++;
            }
        }
        return counter;
    }
}
