package pl.coderslab.homeworks.arrays;


public class Main03 {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 56, 77, 88, 99, 33, 22};
        System.out.println(contains(myArray, 22));


    }

    public static boolean contains(int[] arr, int element) {
        for (int item : arr) {
            if (item == element) {
                return true;
            }
        }
        return false;
    }

}
