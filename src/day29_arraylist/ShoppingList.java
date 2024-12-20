package day29_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        ArrayList <String> shoppingList = new ArrayList<>();
        //size is 0, capacity - 10

        //check the status of the shopping list
       // statusOfShoppingList(shoppingList);


        String userAnswer ="";
        do {
            System.out.println("Please enter item name to add to the list: ");
            String itemToAdd = key.nextLine();

            shoppingList.add(itemToAdd);

            System.out.println("Do you want to add more (yes/no) :");
            userAnswer = key.nextLine();

        }while (userAnswer.equalsIgnoreCase("yes") ||userAnswer.equalsIgnoreCase("y") );

        System.out.println("Shopping list has " + shoppingList.size()+ " items in it");
        for (String eachItem:shoppingList) {
            System.out.println("\t" + eachItem);
        }

        System.out.print("What item do you want to check if available in shopping list: ");

        String itemName = key.nextLine();
        itemAvailableInShoppingList(shoppingList,itemName);


        System.out.println("----------------------------------------------------------");
        System.out.print("Do you want to add more (yes/no) : ");
        userAnswer= key.nextLine();
        //also can use it directly: if(key.nextLine().equals....

        if (userAnswer.equalsIgnoreCase("yes")||userAnswer.equalsIgnoreCase("y")){
            System.out.print("What item do you want to remove in shopping list: ");
            itemName= key.nextLine();

            if (Character.isDigit(itemName.charAt(0))){
                shoppingList.remove(Integer.parseInt(itemName)-1);
            }else {
                shoppingList.remove(itemName);
            }
        }
        System.out.println("Final list: " + shoppingList);

    }

    public static void statusOfShoppingList (ArrayList <String> list) {
        if (list.isEmpty()) {
            System.out.println("Shopping list is empty");
        }else {
            System.out.println("There are some items in the shopping list");
        }
    }

    public static void itemAvailableInShoppingList (ArrayList<String> list, String itemName){
        if (list.contains(itemName)) {
            System.out.println(itemName+ " is on the shopping list");
        } else {
            System.out.println(itemName+ " is not on the shopping list");
        }
    }
}
