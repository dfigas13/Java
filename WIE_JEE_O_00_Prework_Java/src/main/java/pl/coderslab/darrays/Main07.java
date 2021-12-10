package pl.coderslab.darrays;

import java.util.ArrayList;

public class Main07 {

    public static void main(String[] args) {
        double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double avg = 0;
        ArrayList<Double> newTemp = new ArrayList<Double>();


        for (double temp : temps) {
            avg = temp * 1.8 + 32;
            newTemp.add(avg);
//            System.out.println(String.format("Neue Temperatur Kelvin: " + "%.2f", avg));
        }


        double temp2 = 0;
        for (double temp : newTemp) {
            temp2 = temp2 + temp / temps.length;
        }
        System.out.println(String.format("DURCHSCHNITT: " + "%.2f", temp2));






    }
}
