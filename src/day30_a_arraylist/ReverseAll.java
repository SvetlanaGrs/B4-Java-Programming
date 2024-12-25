package day30_a_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println("Not reversed: " + list);

        System.out.println(reverseAllInList(list));
    }

    public static ArrayList <String> reverseAllInList (ArrayList <String> originalList){

        ArrayList <String> reversedList = new ArrayList<>();
        for (String each:originalList) {
            //here we called our custom reusable class
            reversedList.add(StringUtil.reverse(each));

        }
        return reversedList;
    }
}
