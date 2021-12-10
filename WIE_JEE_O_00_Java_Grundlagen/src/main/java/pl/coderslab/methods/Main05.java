package pl.coderslab.methods;

public class Main05 {

    public static void main(String[] args) {
        System.out.println(String.format("%.2f",calculateNet(40,1.20)));
    }

    public static double calculateNet(double brutto, double vat) {
        double netto = brutto / vat;
        return netto;
    }
}
