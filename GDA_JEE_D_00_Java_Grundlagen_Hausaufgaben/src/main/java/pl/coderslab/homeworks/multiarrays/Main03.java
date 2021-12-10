package pl.coderslab.homeworks.multiarrays;


import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        int[][] array = {{1, 3, 4}, {7, 8, 10, 11}};

        System.out.println(Arrays.toString(lessMore(array)));
    }

    public static int[] lessMore(int[][] arr) {
        int arrLength = arr[0].length + arr[1].length;
        int result = 0;
        int result2 = 0;
        int more = 0;
        int less = 0;
        int[] myList = new int[arr.length];


        for (int[] item : arr) {
            for (int item2 : item) {
                result += item2;
                result2 = result / arrLength;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > result2) {
                    more++;
                    myList[i] = more;
                } else if (arr[i][j] < result2) {
                    less++;
                    myList[i] = less;
                }
            }
        }
        /*System.out.println("More: " + more);
        System.out.println("Less: " + less);*/

        return myList;
    }


}
