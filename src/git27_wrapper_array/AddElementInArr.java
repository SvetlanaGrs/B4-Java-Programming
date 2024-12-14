package git27_wrapper_array;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class AddElementInArr {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        int [] b = addElemInArr(a,6);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(addElemInArr(a, 90)));
        System.out.println("-----------------------------------------");
        int []c = addElemInArr(a, 3,4,5,6);
        System.out.println(Arrays.toString(c));

        int []d = addElemInArr(a, 3,4,5,6,100,500);
        System.out.println(Arrays.toString(d));

    }

    public static int [] addElemInArr (int [] arr, int num){

        int [] addedArr = Arrays.copyOf(arr,arr.length+1); //{1, 2, 3, 4, 5, x}
        addedArr [addedArr.length-1] = num;

        return addedArr;
    }

    public static int [] addElemInArr (int [] arr, int ... arr2) {
        int [] addedArr = Arrays.copyOf(arr, arr.length+arr2.length);

        // String str = null // FOR Non-primitive we can assign to null

        for (int i = arr.length, j =0; i < addedArr.length; i++, j++) {  //i<9, i =5, j = 0
            addedArr[i] = arr2[j];
        }

        return addedArr;
    }
}
