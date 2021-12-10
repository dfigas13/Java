package pl.coderslab.homeworks.multiarrays;


import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        int[][] array = {{10, 22, 2}, {12, 33, 130}};

        int[] minVal = minimum(array);
        System.out.println(Arrays.toString(minVal));

    }

    static int[] minimum(int[][] tab) {
        int[] min = new int[tab.length];
        int localMin = 0;

        for (int i = 0; i < tab.length; i++) {
            localMin = tab[i][0];
            min[i] = tab[i][0];
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] < localMin) {
                    localMin = tab[i][j];
                    min[i] = localMin;
                }
            }
        }
        return min;
    }

}

