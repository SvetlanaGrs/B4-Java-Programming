package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        //Scanner key -- declared Scanner reference
        Scanner key = new Scanner(System.in); //Created the scanner oblects

        System.out.print("Please, enter your name: ");
        String firstName = key.next();

        System.out.print("Please, enter your last name: ");
        String lastName = key.next();

        System.out.println("Are you employed (true/false): ");
        boolean isEmployed = key.nextBoolean();

        System.out.println("Are you student (true/false): ");
        boolean isStudent = key.nextBoolean();


//        System.out.println("Information about " + firstName + " " +  lastName);
//        System.out.println("\tIs Employed: " + isEmployed);
//        System.out.println("\tIs student: " + isStudent);
//        System.out.println(firstName + " - " + lastName + " - " + isEmployed + " - " + isStudent);

        String info = "Information about " + firstName + " " +  lastName + "\n\tIs Employed: " + isEmployed + "\n\tIs student: " + isStudent ;
        System.out.println(info);
    }
}
