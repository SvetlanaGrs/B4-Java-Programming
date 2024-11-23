package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int validPin = 7777;
        int userEnteredPin ;
        int cycle=1;


        //CHALLENGE: allow user to attend max 3 times
        System.out.println("Welcome to ATM");
        do{
            System.out.print("Please enter PIN: ");
            userEnteredPin = key.nextInt();
            cycle++;
        }while (userEnteredPin!=validPin && cycle<=3);

        if (cycle>3 && userEnteredPin!=validPin) {
            System.out.println("You are locked out");
        }
    }
}
