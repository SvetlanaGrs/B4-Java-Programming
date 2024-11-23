package day18_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        String userAnswer= "";
        String shoppingList = "Your shopping list items:";
        do {
            System.out.print("Please enter name of the item: ");
//          String item = key.nextLine(); //banana
//          shoppingList +=item;
            shoppingList = shoppingList + "\n\t" + key.nextLine();

            System.out.println("Do you want to add more?(yes/no)");
           userAnswer = key.nextLine();
        } while (userAnswer.equalsIgnoreCase ("yes") ) ;
        System.out.println(shoppingList);
    }
}
