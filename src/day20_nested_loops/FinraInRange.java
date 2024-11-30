package day20_nested_loops;

import java.util.Scanner;

/*
div.by3 ---FIN
div.by5 ---RA
div.by15 ---FINRA
 */
public class FinraInRange {
    public static void main(String[] args) {
        //range = 50
        Scanner key = new Scanner (System.in);
        System.out.print("Please enter a number to get all \"FIN/RA/FINRA\": ");
        int userNumRange = key.nextInt();

        for (int i = 1; i < userNumRange; i++) {
            int num =i;
            if (i % 3==0 && i % 5==0) {
                System.out.println(num + " - FizzBuzz");
            }else if (i %5 ==0) {
                System.out.println(num + " - Buzz");
            }else if (i % 3==0 ) {
                System.out.println(num + " - Fizz");
            }
        }

    }
}
