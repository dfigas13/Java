package pl.coderslab.homeworks.strings;


public class Main06 {

    public static void main(String[] args) {
        String str = "I love Java";

        System.out.println(replaceStr(str, "love","hate"));

    }
    public static String replaceStr(String str, String forReplace, String replacement) {
        String[] str2 = str.split(" ");
        String result = "";

        for(String item : str2) {
            if(item.equals(forReplace)) {
                result = str.replace(forReplace, replacement);
            }
        }
        return result;
    }
}
