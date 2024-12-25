package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three" , "four", "five", "six"));
        System.out.println(list);
        System.out.println(removeLongStrings(list, 4));

    }

    public static ArrayList <String> removeLongStrings (ArrayList <String> list, int num) {
        ArrayList <String> updatedList = new ArrayList<>(list);
        updatedList.removeIf(each->each.length()<num);
        return updatedList;
    }
}
