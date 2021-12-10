package pl.coderslab.arrays;

public class Main02 {

    public static void main(String[] args) {

        int[] randomNumbers = new int[20];

        for (int i = 0; i < 20; i++) {
            randomNumbers[i] = (int) (Math.random() * 99 + 1);
            System.out.print(randomNumbers[i] + " ");
        }


    }
}
