package day15_string;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String first = key.next().trim();
        System.out.print("Please enter your last name: ");
        String last = key.next().trim();

        System.out.println("------------------------------------------------------");
        System.out.println("Your full name before corrected: " + first + " " + last);

        /*
          first name char Upper case
        rest char first name Lower case
           first char last nameUpper case
        rest char last name Lower case
         */

       //  first name char Upper case
//        ("" + first.charAt(0)).toUpperCase(); //--->T/t

        //2nd option
       String correctedFirstName =  first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        String correcteLastName = ("" + last.charAt(0)).toUpperCase() + last.substring(1).toLowerCase();
        System.out.println();
        System.out.println("Your full name after corrected: " + correctedFirstName + " " + correcteLastName);


    }
}
