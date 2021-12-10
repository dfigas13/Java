package pl.coderslab.methods;

public class Main03 {

    public static void main(String[] args) {
        System.out.println(String.format("%.2f",convertToUsd(55)) + " Usd");
    }

    public static double convertToUsd(double eur) {
        double result =  eur / 1.21;
        return result;
    }
}
