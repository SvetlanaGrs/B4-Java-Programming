package git27_wrapper_array;

import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {

        /*
             Array List :
        -Size is flexible
        -Works ONLY with object data type
         */

        int [] arr;     //array works with primitive
        Integer [] arr2;//array works with nno-primitive

        //ArrayList <int> arrList;      //Collection data types does not work with primitive data type
        ArrayList <Integer> arrList2;   //Collection data types  work ONLY  with non-primitive data type (object)


        ArrayList <Integer> arrList3 = null; //I created ArrayList of Integer reference with no object
        System.out.println(arrList3);

        ArrayList <Integer> arrList4 = new ArrayList<>(); //I created ArrayList of Integer reference with no object
        System.out.println(arrList4); //[]--> empty

        ArrayList <Integer> arrList5 = new ArrayList<Integer>(10); // not usable nowadays, because dates needs to be flexible

        System.out.println();
       // System.out.println(arrList3.size()); Error, it is not object at the memory
        System.out.println(arrList4.size());

        //How to add elements to array list
        System.out.println();
        arrList4.add(45);
        System.out.println(arrList4);
        System.out.println(arrList4.size());

        arrList4.add(-90);   //Array List is ORDERED----> keeps the insertion order
        System.out.println(arrList4);
        System.out.println(arrList4.size());


        arrList4.add(55);//Array List is ORDERED----> keeps the insertion order
        arrList4.add(100);//Array List is ORDERED----> keeps the insertion order
        System.out.println(arrList4);
        System.out.println(arrList4.size());

        System.out.println();
        arrList4.add(1,50); //We added at the index
        System.out.println(arrList4);

        //arrList4.add(10,50); //Error, since i do not have index 10- it will trow IndexOutOfBondsException


        System.out.println();
        //[45, 50, -90, 55, 100]
        //How to reach all of these elements from Array list?

        System.out.println(arrList4.get(0));
        System.out.println(arrList4.get(1));
        System.out.println(arrList4.get(arrList4.size()-1));

        int firstElementOfArr = arrList4.get(0); // arrList4.get(0)----Integer 45----UNBOXING(Automatically)----> int 45

    }
}
