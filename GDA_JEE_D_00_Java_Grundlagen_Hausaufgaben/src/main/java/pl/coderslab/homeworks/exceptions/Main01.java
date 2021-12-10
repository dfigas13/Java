package pl.coderslab.homeworks.exceptions;


public class Main01 {

    public static void main(String[] args) {
        String a = "12.123";
        String b = "2.1";

        try {
            average(a, b);
        } catch (ArithmeticException e) {
            System.out.println("EXCEPTION: " + e);
        }

    }

    public static void average(String a, String b) {
        double intA = Double.parseDouble(a);
        double intB = Double.parseDouble(b);

        double result = 0;
        if (intB == 0 || intA == 0) {
            throw new ArithmeticException();
        } else {
            System.out.print("Result: ");
            System.out.println(result = intA / intB);
        }
    }

}
