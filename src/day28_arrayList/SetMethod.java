package day28_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        System.out.println(nums);

        nums.set(1, 900);
        System.out.println(nums);

      //  nums.set(5, 800);
      //  System.out.println(nums);

        //update the last element at the arraylist
        //nums.set(4,1000) ---> if we want to do it dynamically--->
        nums.set(nums.size()-1,1000);
        System.out.println(nums);

        System.out.println();
        ArrayList <String> strArr = new ArrayList<>();
        strArr.add("java");
        strArr.add("api");
        strArr.add("db");
        strArr.add("ci/cd");
        strArr.add("soft-skills");
        System.out.println(strArr);
        strArr.set( 2,"data");
        System.out.println(strArr);
    }
}
