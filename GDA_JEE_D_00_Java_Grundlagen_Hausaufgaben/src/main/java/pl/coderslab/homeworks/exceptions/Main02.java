package pl.coderslab.homeworks.exceptions;


public class Main02 {

    public static void main(String[] args) {

        String[] strTab = {"Mary", "Kte" , "Luka", "Rolf"};

    try {
        System.out.println(safeGet(strTab, 10));
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("EXCEPTION: " + e);
        }

    }

    public static String safeGet(String[] strTab, int index) {
        String result = "";

        for (int i = 0; i < strTab.length; i++) {
            if (i == index) {
                result = strTab[i];
            } else if (index > strTab.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        return result;
    }

}
