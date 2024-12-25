package day30_a_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        System.out.println("Original: " + list);
        System.out.println(switchPairs(list));
    }
    public static ArrayList <String> switchPairs (ArrayList <String> list){
        ArrayList<String> reverseWords = new ArrayList<>();
//       "Cat", "in", "the", "hat"
        // 0      1     2      3
        for (int i = 0; i <list.size() ; i+=2) {
            Collections.swap(list, i, i+1);
        }
        reverseWords.addAll(list);

        return reverseWords;
    }


}
