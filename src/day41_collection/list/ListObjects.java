package day41_collection.list;

import java.lang.ref.Reference;
import java.util.*;

public class ListObjects {
    public static void main(String[] args) {

        /*
        ArrayList <String> list = new ArrayList<>();          //Reference : ITSELF (ArrayList)
        List <String> list1 = new ArrayList<>();              //Reference : First interface 'List'
        Collection <String> list2 = new ArrayList<>();        //Reference : Second interface 'Collection'
        Iterable <String> list3 = new ArrayList<>();          //Reference : Third interface 'Iterable'
        */

        List <String> list1 = new ArrayList<>();              //Reference : List interface - object is ArrayList class - internally uses dynamic Array
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add(null);                    //null is allowed
        list1.add("a");                     //duplicate elements are allowed
        System.out.println(list1);          //insertion order is kept ( the order has been used to add element is same as the
        System.out.println(list1.get(3));   //get() comes rom List interface - ArrayList works with indexes

        System.out.println();

        List <String> list2 = new LinkedList<>();               //Reference : List interface - object is LinkedList class - internally uses Nodes
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);                    //null is allowed
        list2.add("a");                     //duplicate elements are allowed
        System.out.println(list2);          //insertion order is kept ( the order has been used to add element is same as the
        System.out.println(list2.get(3));   //get() comes rom List interface - ArrayList works with indexes

        System.out.println();

        List <String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);                    //null is allowed
        list3.add("a");                     //duplicate elements are allowed
        System.out.println(list3);          //insertion order is kept ( the order has been used to add element is same as the
        System.out.println(list3.get(3));   //get() comes rom List interface - ArrayList works with indexes
    }
}
