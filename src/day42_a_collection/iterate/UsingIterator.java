package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList <String> listOfModules = new ArrayList<>();

        listOfModules.add("Java");
        listOfModules.add("Softskills");
        listOfModules.add("Database");
        listOfModules.add("API");
        listOfModules.add("Java");
        System.out.println(listOfModules);

        ArrayList <String> listOfModules2 = new ArrayList<>(listOfModules);

        //I got 2 options to remove
        //1 is using iterator. I need to assign my collection data structure to iterator - to be able using iterator methods
        Iterator <String> anyName = listOfModules.iterator(); //iterator method returns your collection data structure as Iterator





        while (anyName.hasNext()){
            if(anyName.next().length() > 4){
                anyName.remove();
            }
        }
        System.out.println(listOfModules);

        System.out.println("----------------------------------");
        System.out.println(listOfModules2);
        listOfModules2.removeIf(each -> each.length() > 4);
        System.out.println(listOfModules2);
    }
}
