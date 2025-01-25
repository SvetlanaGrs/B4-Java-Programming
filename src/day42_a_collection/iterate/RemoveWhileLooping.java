package day42_a_collection.iterate;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(2, 3 , 5, 6, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list);

        //removeAll(object) - we can use this for specific element but if ...

        //1. try removing with traditional loop-----With this way once the element is removed -> everything is shifted to the left and causing missing some elements to be checked
//        for (int i = 0; i < list.size(); i++) {
//           // System.out.println(list.get(i));
//            if(list.get(i)<=6){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
        //NOTE: You can adjust the 'i' on if statement for it to work properly---> but it still not good way

        //i = 0 ---> 2, 3 , 5, 6, 6, 12, 54, 23, 65, 3, 6
        //           3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        //i = 1 ---> 3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        //...

        //2. try removing with foreach loop - ConcurrentModificationException
        //with foreach loop we can not change the size while looping

//        for(Integer each:list){
//            if(each<=6){
//                list.remove(each);
//            }
//        }
//        System.out.println(list);
        //1st cycle - each - 2, 3 , 5, 6, 6, 12, 54, 23, 65, 3, 6
        //                   3 , 5, 6, 6, 12, 54, 23, 65, 3, 6       size changed -less
        //2nd cycle - each - since the size changed - foreach loop will give an exception

        //3 - iterator
        Iterator <Integer> it = list.iterator();// I need this line of a code, to be able to call hasNext(), next(), remove() form Iterator interface;
        // it = [2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6];
        while(it.hasNext()){
            if(it.next()<=6){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("-------------------------------------");

        // 4 - with removeIf(); / this method is from Functional Interface
        System.out.println("----------------------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list2);
        list2.removeIf(e -> e <= 6);
        System.out.println(list2);
    }
}
