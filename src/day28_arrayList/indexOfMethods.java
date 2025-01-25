package day28_arrayList;

import java.util.ArrayList;

public class indexOfMethods {
    public static void main(String[] args) {


        String str = "Looooop";
        System.out.println("String " + str);
        System.out.println(str.indexOf("o")); //will return the index of the first match
        System.out.println("l"); //doesnt exist ==-1

        System.out.println(str.lastIndexOf("o"));

        System.out.println();

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        nums.add(100);
        System.out.println("String ArrayList " + nums);

        //.indexOf()
        System.out.println(nums.indexOf(100));
        System.out.println(nums.indexOf(700));

        int indexOf500 =nums.indexOf(500);
        System.out.println(indexOf500);
        System.out.println("--------------");

        //.lastIndexOf();
        System.out.println(nums.lastIndexOf(100));

        System.out.println("--------------");
        nums.add(350);
        nums.add(450);
        nums.add(100);
        nums.add(250);
        System.out.println(nums);
        nums.lastIndexOf(100);
        nums.set(nums.lastIndexOf(100), -100);
        System.out.println(nums);



    }
}
