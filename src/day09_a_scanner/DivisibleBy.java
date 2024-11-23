package day09_a_scanner;

import java.util.Scanner;
//import java.util.*; //*----->everything

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = key.nextInt();
        boolean isDivby2 = num % 2 ==0;
        boolean isDivby3 = num % 3 ==0;
        boolean isDivby5 = num % 5 ==0;
        System.out.println(num + "is divisible by 2: " + (num % 2 ==0) );
        System.out.println(num + "is divisible by 3: " + (num % 3 ==0) );
        System.out.println(num + "is divisible by 5: " + (num % 5 ==0) );

        boolean isDivBy2_3_5 = isDivby2 && isDivby3 && isDivby5;
//        or
//        num % 2 ==0 && num % 3 ==0 && num % 5 ==0;

    }
}
