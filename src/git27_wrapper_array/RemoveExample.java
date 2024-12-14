package git27_wrapper_array;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList <String> arrList = new ArrayList<>(); // capacity is 10 -meaning save a memory that can store 10 elements
        System.out.println(arrList.size()); //0
        System.out.println(arrList);

        //Lets add some data in it
        //arrList.add(10); //Not valid because ArrayList is String Data Type (Not Integer)
       // arrList.add(true); Also can not, not Boolean

        arrList.add("java");
        arrList.add("bread");
        arrList.add("water");
        arrList.add("butter");
        System.out.println(arrList); // Insertion order is kept. Array list is ORDERED
        arrList.add(0, "banana");
        System.out.println(arrList);
        System.out.println(arrList.size());

        System.out.println();
        //How can i remove element from specific index?
        arrList.remove(0);
        System.out.println(arrList);
        System.out.println(arrList.size());
        System.out.println();

//        arrList.remove(4);         //.IndexOutOfBoundsException
//        System.out.println(arrList);

       String removedElement =  arrList.remove(1); //This method also returns the element which was the removed
        System.out.println("Removed element is : "+removedElement);
        System.out.println(arrList);
        System.out.println(arrList.size());

        System.out.println();

        // Remove the last element
        arrList.remove(arrList.size()-1);
        System.out.println(arrList);
        System.out.println(arrList.size());

        System.out.println();

        arrList.add("api");
        arrList.add("sql");
        arrList.add("soft-skills");
        arrList.add("soft-skills");
        System.out.println(arrList);
        System.out.println(arrList.size());

        System.out.println();

        boolean isRemoved = arrList.remove("soft skills");
        System.out.println(isRemoved);
        System.out.println(arrList);

        System.out.println();

        arrList.remove("soft-skills");
        System.out.println(arrList);
    }
}
