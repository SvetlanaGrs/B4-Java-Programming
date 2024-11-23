package day09_a_scanner;

//Why we need to import
// Since we work in one package but we need something from different package, we need to import it first to be able to use anything inside of that package

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Please enter a price of the item: ");
        double price = input.nextDouble();
        System.out.print("Please enter a quantity of the items: ");
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println("Your total is: $" + revenue);

    }
}
