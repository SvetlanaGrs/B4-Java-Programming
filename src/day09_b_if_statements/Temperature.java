package day09_b_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = key.nextInt();

        if (temp >= 70) { // if (temp >70 || temp ==70
            System.out.println("It's a nice day.\nGo outside, but with your laptop to code Java");
        }else {
            System.out.println("It's too cold.\nCode Java");
        }
    }
}
