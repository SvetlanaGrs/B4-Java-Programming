package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = key.nextInt();
//        if (number %3 ==0) {
//            System.out.println("Fizz");
//        }else if (number %5 ==0) {
//            System.out.println("Buzz");
//        }else if (number % 3==0 && number % 5==0) {
//            System.out.println("FizzBuzz");
//        }else {
//            System.out.println("f");
//        }


// OPTION1
        if (number % 3==0 && number % 5==0) {
            System.out.println("FizzBuzz");
        }else if (number %5 ==0) {
            System.out.println("Buzz");
        }else if (number % 3==0 ) {
            System.out.println("Fizz");
        }else {
            System.out.println("Your number: " + number);
        }

        // OPTION2
        if (number % 3==0 && number%5 !=0) {
            System.out.println("Fizz");
        }else if (number %5 ==0 && number%3!=0) {
            System.out.println("Buzz");
        }else if (number % 3==0 && number % 5==0) {
            System.out.println("FizzBuzz");
        }else {
            System.out.println("Your number: " + number);
        }

    }
}
