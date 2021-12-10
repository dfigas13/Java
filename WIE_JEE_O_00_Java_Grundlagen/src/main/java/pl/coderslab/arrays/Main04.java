package pl.coderslab.arrays;

public class Main04 {

    public static void main(String[] args) {
        System.out.println();
        int[] numbers = {3, 5, 7, 2, 1,5,8,9,11,13};
        int[] reverse = new int[10];

        for (int i = numbers.length - 1; i >= 0; i-- ) {
            reverse [i] = numbers[i];
            System.out.print(reverse[i] + ", ");
        }

    }
}
