package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Coffeine {
    public static void main(String[] args) {
        //Bulk Actions

        System.out.println("BULK ACTIONS");
        ArrayList <String> drink10 =  new ArrayList<>();
      //  drink10.add("coffee");
      //  drink10.add("tea");
        drink10.addAll(Arrays.asList("coffee", "tea", "energy drinks"));
        System.out.println(drink10);
        drink10.add("milkchake");
        System.out.println(drink10);
        drink10.add(1, "latte");
        System.out.println(drink10);

        drink10.addAll(Arrays.asList("matcha", "hot cocoa")) ;
        System.out.println(drink10);

        drink10.addAll(2, Arrays.asList("hot chocolate", "chai latte"));
        System.out.println(drink10);
    }
}
