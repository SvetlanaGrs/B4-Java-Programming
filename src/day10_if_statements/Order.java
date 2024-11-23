package day10_if_statements;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

//    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your product name: ");
        String name = key.nextLine();

        System.out.print("Enter the price: ");
        double price = key.nextDouble();

        System.out.print("Please enter the quantity: ");
        int num = key.nextInt();

        key.nextLine();

        System.out.print("Please enter your full name: ");
        String fullName = key.nextLine();

      String orderDetail = fullName + " your order for " + num + " " + name + " has been placed. Your total is $" + price * num ;
       System.out.println(orderDetail);
   }
}
