package pl.coderslab.arrays;

public class Main01 {

    public static void main(String[] args) {

        int mainTab[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
                40, 41, 42, 43, 44, 45, 46, 47, 48, 49};

        for(int i = 0; i <= mainTab.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            if (i < 10) {
                System.out.print("0");
            }
            System.out.print(i + "; ");
        }


    }
}
