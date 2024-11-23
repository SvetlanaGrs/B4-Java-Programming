package day10_if_statements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter  a number between 1 and 7: ");
        int number = key.nextInt();
        boolean isMonday = number == 1;
        if (isMonday) {
            System.out.println("Is Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
        }
        if (number == 3) {
            System.out.println("Wedesday");
        }
        if (number == 4) {
            System.out.println("Thursday");
        }
        if (number == 5) {
            System.out.println("Friday");
        }
        if (number == 6) {
            System.out.println("Saturday");
        }
        if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input. Your number is not between 1 and 7. Your number is " + number);
        }


        System.out.println("----------------------------------");
        if (isMonday) {
            System.out.println("Is Monday");
        }else if (number == 2) {
            System.out.println("Tuesday");
        }else if (number == 3) {
            System.out.println("Wedesday");
        }else if (number == 4) {
            System.out.println("Thursday");
        }else if (number == 5) {
            System.out.println("Friday");
        }else if (number == 6) {
            System.out.println("Saturday");
        }else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input. Your number is not between 1 and 7. Your number is " + number);
            }
        }
}
