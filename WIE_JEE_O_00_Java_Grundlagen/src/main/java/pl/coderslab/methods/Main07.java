package pl.coderslab.methods;

public class Main07 {

    public static void main(String[] args) {
        int myNUmber = 6;
        System.out.println(checkEvenOdd(myNUmber));
    }

    public static String checkEvenOdd (int number) {
        if (number % 2 == 0) {
            return ("Even");
        } else {
            return ("Odd");
        }
    }
}
