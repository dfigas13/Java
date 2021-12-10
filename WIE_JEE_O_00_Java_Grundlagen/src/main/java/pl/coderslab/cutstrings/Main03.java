package pl.coderslab.cutstrings;

public class Main03 {

    public static void main(String[] args) {
        String str = "Das ist der Text, der ich geschrieben habe";
        System.out.println("Anzahl der Wörter: " + countTokens(str));


    }

    public static int countTokens(String str) {
        String[] parts = str.split(" ");
        int res = 0;
        for(String part : parts) {
            res++;
        }
        return res;
    }
}
