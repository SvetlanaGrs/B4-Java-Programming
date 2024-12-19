package day28_arrayList;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        //.isEmpty() --> returns boolean --> true if  empty, otherwise false
        System.out.println(nums.isEmpty());
        boolean result = nums.isEmpty();
        System.out.println(result);

        System.out.println();

        nums.add(100);
        System.out.println(nums.isEmpty());

        //nums.add("200");
       // nums.add(Integer.parseInt("200"));

        nums.add(Integer.valueOf("200"));
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        System.out.println(nums);


        System.out.println( nums.contains(400));

        boolean hasValue = nums.contains(700);
        System.out.println(hasValue);
    }
}
