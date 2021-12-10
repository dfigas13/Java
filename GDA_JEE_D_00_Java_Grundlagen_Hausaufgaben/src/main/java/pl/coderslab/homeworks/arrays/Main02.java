package pl.coderslab.homeworks.arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        System.out.println(append(arr));
    }

    public static int[] append(int[] arr) {
        int[] arr2 = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[3] = 3;
        arr2[4] = 2;
        arr2[5] = 1;

        for (int item : arr2) {
            System.out.print(item + ", ");
        }

        return arr2;
    }

}
