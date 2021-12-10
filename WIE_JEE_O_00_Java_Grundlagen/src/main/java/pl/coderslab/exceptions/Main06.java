package pl.coderslab.exceptions;


public class Main06 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(15,3));
        System.out.println(divide(15, 0));
        } catch(ArithmeticException e) {
            System.out.println("You can't divide by 0");
        }

    }

    static int divide (int a, int b){
        int result = 0;
        if(b == 0) {
            throw new ArithmeticException();
        } else {
            result = a / b;
            return result;
        }

    }

}
