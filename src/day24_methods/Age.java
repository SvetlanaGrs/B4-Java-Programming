package day24_methods;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the year you were born: ");
        int userBirthYear = key.nextInt();

        calculateAge(userBirthYear);
    }

    public static void calculateAge (int year) {
        //userBirthYear = 1990;
        System.out.println("Your age is " + (2024 - year));
        //System.out.println("Your age is " + (xxxx - year)); --- there is uyility class in java that return the current year
       //System.out.println("Your age is " + (Year.now().getValue() - year));

    }
}
