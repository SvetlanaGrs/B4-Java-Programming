package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {3,4,5} ;

        //Option 1 - with fori loop / traditional loop
        for (int i = 0; i < nums.length ; i++) {
            System.out.println("Traditional loop " + nums[i]);
        }
        System.out.println();
        //Option 2 - with foreach loop
        for ( int eachElement : nums ) {
            System.out.println("Foreach loop: " + eachElement);
        }

        // you can only start from beggining and go all the way to the last element

        System.out.println();
        String [] names = new String[4];
        for ( String each :names) {
            System.out.println(each);
            each = "Loopcamp"; //This reassign each variable but not reassign in array
        }
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            names [i] = "Loopcamp";
        }
        System.out.println(Arrays.toString(names));

        System.out.println();
        double [] arr3 = {34,28,56,87};
        for (double each :arr3){
            System.out.println(each);
        }

        System.out.println();
        char [] letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};
        for (int i = letters.length/2; i < letters.length ; i++) {
            System.out.println(letters[i]);
        }

        for (char each :letters) {
            System.out.println(each);
        }
    }
}
