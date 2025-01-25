package day45_functions_stream.functional_interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate <Integer [] , Integer> arrContains = (arr, num) -> {
          for(Integer each:arr){
              if(each==num){
                  return true;
              }
          }
            return false;
        };


        BiPredicate <Integer [] , Integer> arrContains2 = (arr, num) -> {
           return Arrays.asList(arr).contains(num);
        };


        Integer [] arr = {1,2,3,4,5};
        System.out.println(arrContains.test(arr, 2));

        System.out.println(arrContains2.test(arr, 2));
        System.out.println(arrContains2.test(arr, 7));


        //TODO:create implementation that takes two array of Characters and check if it is Anagram (two words containing same characters) listen silent
    }
}
