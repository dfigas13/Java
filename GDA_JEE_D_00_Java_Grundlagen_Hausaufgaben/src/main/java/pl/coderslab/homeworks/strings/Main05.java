package pl.coderslab.homeworks.strings;


public class Main05 {

    public static void main(String[] args) {
        String str = "My string to replace";

        System.out.println(replaceChar(str, 't', 'l'));


    }
    public static String replaceChar(String str, char forReplace, char replacement) {
        String[] str2 = str.split("");
        String myStr = "";

        for (int i = 0; i <= str2.length; i++) {
            myStr = str.replace(forReplace, replacement);
        }
        return myStr;
    }

}
