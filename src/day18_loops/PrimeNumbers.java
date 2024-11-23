package day18_loops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Please enter a number: ");
        int num = key.nextInt();
        int count = 0;

        for (int i = 1; i <= num ; i++) {

            if (num%i ==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is non prime number");
        }
    }
}
