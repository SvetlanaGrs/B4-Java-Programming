package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList <Integer> nums1 = new ArrayList<>(Arrays.asList(3, 54, 23, 76, 87, 34, 23, 7 , 9));
        System.out.println("Original : " + nums1);

        ArrayList <Integer> nums2 = nums1;
        ArrayList <Integer> nums3 = new ArrayList<>(nums1); //copy of num1

        nums3.removeIf( eachElement -> eachElement%2 ==0);
        System.out.println("Remove if: " + nums3);

        nums3.removeIf(each ->each<10);
        System.out.println("Remove if :" + nums3);

        //.replaceAll()
        nums3.replaceAll(each ->each*2);
        System.out.println("Replace all: " + nums3);
    }
}
