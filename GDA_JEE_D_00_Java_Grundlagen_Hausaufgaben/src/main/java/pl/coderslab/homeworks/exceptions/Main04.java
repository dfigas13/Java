package pl.coderslab.homeworks.exceptions;


public class Main04 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(toInt(str + "abx"));

    }

    public static int toInt(String str) {
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("EXCEPTION: " + e);
        }
        return result;
    }

}
