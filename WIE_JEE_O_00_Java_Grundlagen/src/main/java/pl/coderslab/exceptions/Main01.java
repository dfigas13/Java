package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {
        /*Kontrollierte Ausnahme*/
        try {
            System.out.println(factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument");
        }

    }

    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }


}
