package day42_a_collection.collection;

import java.util.*;

public class ListvsSet {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(); //List interface = duplicate allowed, null allowed , insertion order is kept
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
       // list.add(null);
        System.out.println(list);
        System.out.println(list.get(0)); // since list works with indexes, i can use indexes
        System.out.println(list.get(list.size()-1));

        System.out.println("---------------------------");

        Set <Integer> set = new HashSet<>();//Set interface = duplicate NOT allowed, null allowed , insertion order is NOT kept
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        //set.add(null);  //Since we use HashSet class - null is ALLOWED (but in TreSet null not allowed)
        System.out.println(set);
       // System.out.println(set.get(0));  //Since Set interface doesnt work with indexes - we can not use indexes
       // System.out.println(set.get(set.size()-1));

        //Q :How then we can get elements for Set?
        //A: Loop through set and get the matching element
        for (Integer each: list){
            if(each==4){ //null==4-->Object can not be compared with==
                System.out.println(each);
            }
        }
        System.out.println();
        //loop through list and print each element
        for (Integer each: list){
            System.out.println(each);
        }

        System.out.println("---------------------------");
        //Q: can i take one collection and sort it
        System.out.println(set);
        Set <Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);

        System.out.println("---------------------------");
        //Q: How can i remove duplicates
        System.out.println(list);
        Set <Integer> noDup1 = new HashSet<>(list);
        System.out.println(noDup1);

        Set <Integer> noDup3 = new LinkedHashSet<>(list);  //Removed duplicate and kept the order same
        System.out.println(noDup3);

        // Q: Can you remove duplicates elements from the follow array
        // [2, 4, 3, 23, 76, -3, -5, 2, 8, 4]
        Integer [] arr = {2, 4, 3, 23, 76, -3, -5, 2, 8, 4};

        // 1 - I can do nested loop and add non duplicates into new array
        // 2 - I can conver array with Arrays.asList() method and assign it into an approprated collection
        // 3 - I can use Collections.sort(); just to sort (not remove duplicates)

        System.out.println(Arrays.toString(arr));
        System.out.println(  new LinkedHashSet<>(Arrays.asList(arr))  ); // remove dup and keep same order
        System.out.println(  new TreeSet<>(Arrays.asList(arr))  ); // remove dup and sort the order

        System.out.println("-------------------------");
        //Q: Can you remove duplicate characters from this string
        // "avnaljkashsldkvnsalsdkffgnv"

        String str = "avnaljkashsldkvnsalsdkffgnv";

        System.out.println( Arrays.toString( str.split("") ) );
        System.out.println( new LinkedHashSet<>( Arrays.asList(    str.split("")   )  )  );

    }
}
