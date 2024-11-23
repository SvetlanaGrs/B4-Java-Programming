package day10_if_statements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 12, which represent each month: ");
        int month = key.nextInt();
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Month has 31 days");
        } else if (has30Days) {
            System.out.println("Month has 30 days");
        } else if (month ==2){
            System.out.println("Month has 28 days");
        } else {
            System.out.println("The number you have given is not in the range of 1 and 12\n\tYour number was: " + month);
        }
    }
}
