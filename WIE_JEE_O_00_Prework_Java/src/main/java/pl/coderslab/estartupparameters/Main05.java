package pl.coderslab.estartupparameters;

public class Main05 {

    public static void main(String[] args) {

        int points = 99;
        String msg = "BADVALUE";

        if(points < 0) {
            System.out.println(msg);
        } else if (points > 100) {
            System.out.println(msg);
        } else if (points <= 50) {
            System.out.println("F");
        } else if (points > 50 && points <= 70) {
            System.out.println("E");
        } else if (points > 70 && points <= 90) {
            System.out.println("C");
        } else if (points > 90 && points <=100) {
            System.out.println("A");
        }

    }

}
