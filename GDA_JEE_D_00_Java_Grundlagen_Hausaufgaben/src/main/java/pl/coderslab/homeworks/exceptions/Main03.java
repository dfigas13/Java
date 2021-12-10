package pl.coderslab.homeworks.exceptions;


public class Main03 {

    public static void main(String[] args) {

        String str = "";
        try {
            System.out.println(getLength(str));
        } catch (NullPointerException e) {
            System.out.println("EXCEPTION: " + e);
        }


    }

    public static int getLength(String str) {
        int res = 0;
        if (str.length() == 0) {
            throw new NullPointerException();
        } else if (str.length() > 0) {
            res = str.length();
        }
        return res;
    }

}
