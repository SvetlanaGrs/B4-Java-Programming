package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(returnNums(nums));
    }

    public static ArrayList <Integer> returnNums (ArrayList <Integer> nums) {
        ArrayList <Integer> returnNums = new ArrayList<>();
        for (int i = 0; i <nums.size() ; i+=2) {
            if (nums.get(i)<=nums.get(i+1)) {
                returnNums.add(nums.get(i));
                returnNums.add(nums.get(i+1));
            }
        }

        return returnNums;
    }
}
