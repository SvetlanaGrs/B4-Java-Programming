package day23_multidimensional_arrays;

import java.util.Arrays;

public class recap {
    public static void main(String[] args) {
        int [] arr1 = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 60, 90};

        //How to print arrays
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //How to compare two arrays
        boolean isEqual= Arrays.equals(arr1, arr2);
        System.out.println(isEqual); //or print directly

        //how to sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println();
        //How to join elements in Array / how to convert array into string
        String [] strArr = {"java", "selenium", "jira", "sprint", "release"};
        String.join("", strArr);
        System.out.println(String.join("", strArr));

        System.out.println();
        //How to convert String into String array
        String str3 = "Today is Thursday";
        String [] str3Arr = str3.split(" ");
        System.out.println(Arrays.toString(str3Arr));
        System.out.println(str3Arr.length);

        System.out.println();
        //How to convert String into char array
        String str4 = "loopcamp";
       char [] str4Arr =   str4.toCharArray();
        System.out.println(  Arrays.toString( str4Arr));
        System.out.println( Arrays.toString( str4.toCharArray() )  ); // char array
        System.out.println( Arrays.toString( str4.split("") )); // String array System.out.println();
    }
}
