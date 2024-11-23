package day17_loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = key.nextInt();

        for (int i = 0; i <=10; i++) {
            System.out.println(num + "x" + i + " = " + (num*i));
        }
    }
}
