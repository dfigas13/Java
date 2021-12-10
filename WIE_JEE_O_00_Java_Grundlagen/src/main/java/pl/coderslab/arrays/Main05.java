package pl.coderslab.arrays;

import java.util.Arrays;

public class Main05 {

    public static void main(String[] args) {
        int[] numbers = {33, 22, 1, 7, 2, 6, 9, 12, 44, 88};
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + ", ");
        }




    }
}
