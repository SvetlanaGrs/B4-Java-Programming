package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateNumbers {
    public static ArrayList<Integer> uniqueList (ArrayList <Integer> nums) {
        ArrayList <Integer> uniqueList = new ArrayList<>(nums);
        uniqueList.removeIf(each-> Collections.frequency(nums, each)>1);

        return uniqueList;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(23, 54 ,234, 65 ,34, 23, 34));
        System.out.println("Original: " + nums);
        System.out.println("Unique: " + uniqueList(nums));
    }

}
