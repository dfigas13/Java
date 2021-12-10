package pl.coderslab.homeworks.strings;


public class Main01 {
    public static void main(String[] args) {
        String cesarChiffre = "ala";

        System.out.println(encode(cesarChiffre));
    }


    public static String encode(String str) {
        int index = 0;
        String resultStr = "";
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            index = alphabetString.indexOf(str.charAt(i));
            resultStr = resultStr.concat(String.valueOf(alphabetString.charAt(index + 3)));
        }

        return resultStr;
    }


}
