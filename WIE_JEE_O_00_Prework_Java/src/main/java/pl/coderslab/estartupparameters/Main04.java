package pl.coderslab.estartupparameters;

public class Main04 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a + b > c) {
            System.out.println("YES");
        } else if (c + b > a || a + c > b) {
            System.out.println("NO");
        }

    }

}
