package pl.coderslab.exceptions;

public class Main03 {

    public static void main(String[] args) {
        /*Kontrollierte Ausnahme*/
        try {
            showLength(null);
            } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }

    static void showLength(String s) {
        if (s == null) {
            throw new ArithmeticException();
        } else {
        System.out.println(s.length());
        }
    }

}
