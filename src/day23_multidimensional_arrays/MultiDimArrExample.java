package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultiDimArrExample {
    public static void main(String[] args) {
        int [] n = {5, 10, 20, 10};     //single dimensional arr
        int [] m = {5, 10, 100, 39, 19};//single dimensional arr


        int [][] all2 = {  {5, 10, 20, 10},   {5, 10, 100, 39, 19}  };
        int [][] all = {n,m}; // we stored SINGLE dimensional arrays in 2Dimensional array

        System.out.println(all);                       //HASHCODE ----memory location
        System.out.println(Arrays.toString(all));      //HASHCODE ----memory location----[[I@6acbcfc0, [I@5f184fc6]
        System.out.println(Arrays.deepToString(all));  //[[5, 10, 20, 10], [5, 10, 100, 39, 19]]

        System.out.println();

        int [][] arr2D = {
                {90, 80, 70},       //single dimensional arr which has 2 elements
                {60, 50, 40, 30},   //single dimensional arr which has 4 elements
                {20, 0, -10},       //single dimensional arr which has 3 elements
                {50}                //single dimensional arr which has 1 element
        };
        System.out.println(arr2D.length);
        System.out.println(arr2D[0].length);
        System.out.println(arr2D[1].length);
        System.out.println(arr2D[2].length);
        System.out.println(arr2D[3].length);

        System.out.println();
        //40
        System.out.println(arr2D[1][2]);

        System.out.println();
        System.out.println(Arrays.toString(arr2D[2]));
    }
}
