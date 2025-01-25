package day30_a_arraylist;

import day26_methods.SumOfElements;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    public static void main(String[] args) {
        ArrayList<String> numsAsArr = new ArrayList<>(Arrays.asList("123","34","513")) ;
        System.out.println("Original: " + numsAsArr);

        System.out.println(sumNums(numsAsArr));

    }

    public static ArrayList <Integer> sumNums (ArrayList <String> arr) {
        ArrayList<Integer> sumNums = new ArrayList<>();
        for (String each:arr) {
            System.out.println(each);
            int sumOfAll = 0;
            for(String eachLetter:each.split("")) {  //[1 , 2, 3]
                sumOfAll += Integer.parseInt(eachLetter);//"1"--->1
            }
            sumNums.add(sumOfAll);
        }

        return sumNums;
    }
}
