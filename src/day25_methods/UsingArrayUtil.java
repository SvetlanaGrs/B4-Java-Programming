package day25_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {
        int [] nums = {234, 23 , 76,6, 34};
        System.out.println(ArrayUtil.minNumInArr(nums));
        System.out.println(ArrayUtil.maxNumInArr(nums));

        System.out.println(ArrayUtil.contains(nums, 2));
    }


}
