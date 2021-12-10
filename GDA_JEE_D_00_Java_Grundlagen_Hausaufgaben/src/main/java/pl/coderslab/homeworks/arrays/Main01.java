package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {
        int[] numberArray = {1, 2, 4, 5, 6, 3, 3,};

        System.out.print(returnUnique(numberArray));


    }

    public static int[] returnUnique(int[] arr) {
        int len = arr.length;
        int[] distinctArray = new int[10];
        int index = 0;

        for (int i = 0; i < len; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                distinctArray[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++)
            System.out.print(distinctArray[i] + " ");

        return distinctArray;
    }


}
