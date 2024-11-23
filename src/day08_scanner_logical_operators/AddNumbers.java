package day08_scanner_logical_operators;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();
//        System.out.println("Number 1 is: " + num1);
//        System.out.println("Number 2 is: " + num2);
//        System.out.println("Number 3 is: " + num3);
        int total = num1 + num2 + num3;
        System.out.println("total = " + total);

        int afterDivisionBy2 = total / 2;
        System.out.println("afterDivisionBy2 = " + afterDivisionBy2);

        System.out.println("After added 2: " + (afterDivisionBy2 + 2));
        System.out.println("After added 2: " + (afterDivisionBy2 % 2));

    }
}
