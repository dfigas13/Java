package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args) {
        int a = 7;
        int b = 22;
        int c = 6;

        System.out.println(maxOfThree(a,b,c));

    }

    public static int maxOfThree(int first, int second, int three) {
        int[] allNumbers = {first, second, three};
        int number = 0;
        for(int item : allNumbers) {
            if(item > number) {
                number = item;
            }
        }
        return number;
    }
}
