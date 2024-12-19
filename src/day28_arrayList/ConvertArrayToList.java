package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        //Array works with both: primitive and non primitive(Object type)
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.asList(arr2); //converting array in to arraylist


        //ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(arr)); //ArrayList doesnt work with "int"
        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(arr2)); //Converted Integer arr into Integer ArrList and assigned
        System.out.println(list2);

        //Since .asList( var args) method accept the parameter as var args -- i can directly send all values and assign it into ArrayList
        ArrayList <Integer> list3 = new ArrayList<>(Arrays.asList(11, 12, 13,14 ,15 ,145));
        System.out.println(list3);

        ArrayList <String> list4 = new ArrayList<>(Arrays.asList("java", "api", "sql"));
        System.out.println(list4);

        System.out.println();

        ArrayList <Integer> list5 = new ArrayList<>(Arrays.asList(primitiveArrToObjectArr(arr)));
        System.out.println(list5);
    }

    //convert int arr into Integer arr
    public static  Integer [] primitiveArrToObjectArr (int [] arr) {
        Integer [] objtArr = new Integer [arr.length];

        for (int i = 0; i < objtArr.length; i++) {
            objtArr[i]=arr[i];  //int---> Integer ---> Auto-Boxing
        }

        return objtArr;
    }

    //convert double arr into Double arr
    public static  Double [] primitiveArrToObjectArr (double [] arr) {
        Double [] objtArr = new Double [arr.length];

        for (int i = 0; i < objtArr.length; i++) {
            objtArr[i]=arr[i];  //int---> Integer ---> Auto-Boxing
        }

        return objtArr;
    }


}
