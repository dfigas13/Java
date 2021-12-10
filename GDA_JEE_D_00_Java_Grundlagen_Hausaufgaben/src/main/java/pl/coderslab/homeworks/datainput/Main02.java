package pl.coderslab.homeworks.datainput;


import java.util.Arrays;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedArray()));

    }

    static int[] sortedArray() {

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("GEBE EIN ZAHL: ");
            int number = sc.nextInt();
            arr[i] = number;
        }

        int temp;
        for (int a = 0; a < arr.length -1; a++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[a + 1]) {
                    temp = arr[j];
                    arr[j] = arr[a + 1];
                    arr[a + 1] = temp;
                }
            }
        }
        return arr;
    }

}
