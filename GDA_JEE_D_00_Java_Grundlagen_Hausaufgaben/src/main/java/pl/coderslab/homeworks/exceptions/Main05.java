package pl.coderslab.homeworks.exceptions;


import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main05 {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4};
        int val = 5;

        try {
        System.out.println(indexOf(elements, val));
        } catch (NoSuchElementException e) {
            System.out.println("EX: " + e);
        }

    }

    public static int indexOf(int[] elements, int value) throws NoSuchElementException {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == value) {
                    return  i;
                }
            }
        throw new NoSuchElementException();
    }

}
