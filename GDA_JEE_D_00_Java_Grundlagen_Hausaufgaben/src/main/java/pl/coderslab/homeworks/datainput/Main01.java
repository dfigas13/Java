package pl.coderslab.homeworks.datainput;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

//        myYear();
        retirement();
    }

    public static String[] retirement() {
        String[] persons = {};
        String[][] retirePersons = new String[3][2];
        Scanner sc = new Scanner(System.in);
        while (true) {
          /*  System.out.println("Nachname: ");
            String firstName = sc.next();
            if (firstName.equals("quit")) break;
            System.out.println(firstName);*/

            System.out.println("Vorname: ");
            String lastName = sc.next();
            if (lastName.equals("quit")) {
                break;
            } else {
                retirePersons[0][0]= lastName;

            }

            System.out.println(retirePersons[0][0]);
            System.out.println("Geburtsjahr: ");
             int birthYear = sc.nextInt();
            String birtYearStr = Integer.toString(sc.nextInt());
            retirePersons[0][1] = birtYearStr;


            /*System.out.println("Geschlecht: M oder W: ");
            String gender = sc.next();
            if (gender.equals("quit")) break;*/

        }
        System.out.println("Bye...");
        sc.close();


        return persons;
    }

    public static int myYear() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        return year;
    }



    /* if (myYear() - birthYear > 60) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }*/

}
