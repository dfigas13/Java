package pl.coderslab.cutstrings;

public class Main01 {

    public static void main(String[] args) {

        String str = "Learn programming from scratch and develop your dream career in the IT industry.";

        int strLength = str.length() - 3;
        char charText = str.charAt(strLength);
        char[] charValue = str.toCharArray();


        //10
        int sum = 0;
        char res;
        for (char item : charValue) {
            if (item == charText) {
                sum++;
                res = item;
                System.out.print(res + ",");
            }
        }
        System.out.println();
        System.out.println("Anzahl r Buchstabe: " + sum);
    }
}
