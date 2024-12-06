package day23_multidimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] arr = {4, 55, 4, 10, -1 , 30, 100, 150};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,100));
        System.out.println(Arrays.binarySearch(arr,200));

        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,100));
        System.out.println(Arrays.binarySearch(arr,120));

        //
        int [] arr2 = {4, 55, 4, 10, -1 , 30, 100, 150};
        int num = -1000;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == num) {
                System.out.print("Your first match element index: " + i);
                break;
            } else if (i+1 == arr2.length){
                System.out.print("There is no match");
            }
        }
    }
}
