package pl.coderslab.cflowcontrol;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
