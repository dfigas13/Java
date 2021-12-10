package pl.coderslab.arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] secondNumbers = {2, 4};
        int[] sumArray = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < secondNumbers.length; j++) {
                if(i == j) {
                    sumArray[i] = numbers[i] + secondNumbers[j];
                    System.out.print(sumArray[i] + ", ");
                }
            }
        }

    }
}
