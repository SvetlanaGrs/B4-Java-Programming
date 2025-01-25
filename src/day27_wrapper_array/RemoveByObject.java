package day27_wrapper_array;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1);
        nums.add(2);
        nums.add(30);
        nums.add(4);
        nums.add(3);
        nums.add(60);
        nums.add(20);
        System.out.println(nums);
        System.out.println(nums.size());

        /*
        remove
                remove(index)
                remove (object)
         */

        nums.remove(3); //removed it by using index
        System.out.println(nums);//removed it by Integer- which is object
        System.out.println();

        nums.remove((Integer)3);

        nums.remove((Integer)20); // IndexOutOfBoundsException
        System.out.println(nums);

        nums.remove(Integer.valueOf("4")); // Integer.valueOf("4") --- > (Integer)4
        System.out.println(nums);
        nums.remove(Integer.parseInt("4")); // Integer.parseInt("4") --- > 4 --> int index
        System.out.println(nums);


        nums.remove(Integer.valueOf("40"));
        System.out.println(nums);

        // nums.remove(Integer.parseInt("40")); // IndexOutOfBoundsException
        // System.out.println(nums);


    }
}
