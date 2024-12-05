package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] str = {"java", "hello", "by" , "ba", "Hi" , "4", "$hi" , "10"};

        //sort it
        //alphabetic order if all same
        //Uppercase > lowercase
        //special characters>numbers>uppercase>lowercase ((ASCII))
        Arrays.sort(str);
        System.out.println("After sorting: " + Arrays.toString(str));
    }
}
