package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        System.out.println(checkMaturity(18));
    }

    public static Boolean checkMaturity(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }


}
