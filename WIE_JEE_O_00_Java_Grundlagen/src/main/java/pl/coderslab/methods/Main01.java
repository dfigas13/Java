package pl.coderslab.methods;

public class Main01 {

    public static void main(String[] args) {
        System.out.println(multiply(8, 2));
    }

    public static int multiply(int multipler, int index) {
        index *= multipler;
        return index;
    }


}
