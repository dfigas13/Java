package pl.coderslab.estartupparameters;

public class Main03 {
    public static void main(String[] args) {
        int nr1 = Integer.parseInt(args[0]);
        int nr2 = Integer.parseInt(args[1]);
        int nr3 = Integer.parseInt(args[2]);
        int nr4 = Integer.parseInt(args[3]);

        int[] numbers = {nr1, nr2, nr3, nr4};
        int result = 0;
        for (int num : numbers) {
            result = result + num;
        }
            System.out.println(result / numbers.length);



    }
}
