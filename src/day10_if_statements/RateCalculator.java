package day10_if_statements;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        double salary; // , double rate
        int hoursPerWeek;
        double hourlyRate;

        System.out.print("Enter your annual salary: ");
        salary = key.nextDouble();

        System.out.println("How many hours she/he works: ");
        hoursPerWeek = key.nextInt();

        hourlyRate = salary / (hoursPerWeek * 52);
        System.out.println("My annual salary is : " + salary + "\nWork hours per week : " +  hoursPerWeek + "\nYour hourly rate : " + hourlyRate );

    }
}
