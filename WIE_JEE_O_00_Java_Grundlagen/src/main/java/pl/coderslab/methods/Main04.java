package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {
        System.out.println(createName("Marta", "Frankenstein", "Frankenmara"));
    }

    public static String createName(String name,String surname, String nickname ) {
        return name + "\t" + nickname + "\t" + surname;
    }
}
