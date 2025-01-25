package day25_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {

        int [] nums ={23,234, 10, 120,2, 3, 5};
        System.out.println(minNumInArr(nums));
        System.out.println(ArrayUtil.minNumInArr(nums));
    }


    public static int minNumInArr (int [] arr){
        int  min=0;
        Arrays.sort(arr);

        min=arr[0];

        return min;
    }
}
