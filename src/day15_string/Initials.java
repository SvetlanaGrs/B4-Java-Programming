package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Enter your first name: ");
        String firstName = key.next();//.toUpperCase();
        System.out.print("Enter your last name: ");
        String lastName = key.next();//.toUpperCase();

        char firstCharOfFirstName = firstName.charAt(0);
//        char firstCharOfFirstName = firstName.toUpperCase().charAt(0);                //ALSO WE CAN DO IT HERE
        char firstCharOfLastName = lastName.charAt(0);

        System.out.println(("" + firstCharOfFirstName + firstCharOfLastName).toUpperCase()); // USE "" if you want to see CHAR

    }
}
