package pl.coderslab.homeworks.strings;


public class Main02 {

    public static void main(String[] args) {
        String str = "ala";
        int shift = 3;
        System.out.println(encode(str,shift));
    }

    public static String encode(String str, int shift) {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            index = alphabetString.indexOf(str.charAt(i));
            result = result.concat(String.valueOf(alphabetString.charAt(index + shift)));
        }
        return result;
    }
}
