package day11_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int expPin = 2222;
        double balance = 100_000.00;

        System.out.print("Welcome to ATM\n\tPlease, insert your card.\n\tThen, please enter your pincode: ");
       int actualPin =  key.nextInt();

       if (actualPin==expPin) {
           System.out.println("\n\tYou are logged in.");
           System.out.println("\tSelect one of the options below: ");
           System.out.println("\t\t1) - Check Balance");
           System.out.println("\t\t2) - Deposit");
           System.out.println("\t\t3) - Withdraw");
           System.out.println("\t\t4) - Cancel");
           System.out.print("\t\tYour choice (1-4): ");
           int userChoice = key.nextInt();

           if (userChoice==1) {
               System.out.println("\n\t\tYour balance is: " + balance);
           } else if (userChoice == 2) {
               System.out.println("\n\t\tInsert your cash: ");
               double deposit = key.nextDouble();
               balance+=deposit;
               // balance+=key.nextDouble();  WE CAN DO IT LIKE THIS TOO
               System.out.print("After deposit your new balance is: $" + balance);

           }else if (userChoice == 3) {
               System.out.println("Please enter the amount you want to withdraw: ");
               double withdraw = key.nextDouble();

//               if (balance<0){
//                   System.out.println("\t\tInvalid input. Logging you out");
//               }else {
               if (withdraw>balance) {
                   System.out.println("Not enough money.");
               }else {
                   balance -= withdraw;
                   System.out.println("Your balance after withdraw: $" + balance);
               }

           }else if (userChoice == 4) {
               System.out.println("");

           }else {
               System.out.println("\n\t\tInvalid option. Exiting system by logging you out.");
           }
       }else {
           System.out.println("\n\tInvalid Pincode. Please enter correct pincode");
       }
    }
}
