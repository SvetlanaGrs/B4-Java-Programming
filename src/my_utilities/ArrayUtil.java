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


    /**
     * This methods returns the index of given num from the given int array
     * @param arr given int array
     * @param num given int value
     * @return the index of value if exists, if not =-1
     */
    public static int indexOf (int [] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==num ) {
                index=i;
                break;
            }
        }
        return index;
    }

    /**
     * This methods returns the index of given num from the given int array
     * @param arr given String array
     * @param word given String value
     * @return the index of value if exists, if not =-1
     */
    public static int indexOf (String [] arr, String word) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                index=i;
                break;
            }
        }
        return index;
    }


    /**
     * This method returns the total sum of all the  numbers in given int array
     * @param arr given int array
     * @return sum
     */
    public static int sum (int ... arr) {

        int total =0;
        for (int each:arr){
            total+=each;
        }
        return total;
    }

    /**
     * This method returns int [] arr with the given element  at the end
     * @param arr given int [] arr
     * @param num
     * @return
     */
    public static int [] addElemInArr (int [] arr, int num){

        int [] addedArr = Arrays.copyOf(arr,arr.length+1); //{1, 2, 3, 4, 5, x}
        addedArr [addedArr.length-1] = num;

        return addedArr;
    }



    /**
     *This method returns int [] arr with the given int var args elements  at the end of the given array
     * @param arr
     * @param arr2
     * @return int array
     */
    public static int [] addElemInArr (int [] arr, int ... arr2) {
        int [] addedArr = Arrays.copyOf(arr, arr.length+arr2.length);

        for (int i = arr.length, j =0; i < addedArr.length; i++, j++) {
            addedArr[i] = arr2[j];
        }
        return addedArr;
    }

    /*
    TODO: add the version  of (method overloaded) for the string (last two methods)
     */
}
