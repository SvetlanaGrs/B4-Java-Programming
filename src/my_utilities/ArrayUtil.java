package my_utilities;

import java.util.Arrays;

/**
 * This method return the minimum value in the given int array
 */
public class ArrayUtil {


    public static int minNumInArr (int [] arr){
        int  min=0;
        Arrays.sort(arr);

        min=arr[0];

        return min;
    }

    public static int maxNumInArr (int [] arr){
        int  max=0;
        Arrays.sort(arr);

        max=arr[arr.length-1];

        return max;
    }

    public static boolean contains (int [] arr, int num) {
        boolean result = false;

        for (int each:arr) {
            if (each==num) {
                result = true;
                break;
            }
        }
        return result;
    }
}
