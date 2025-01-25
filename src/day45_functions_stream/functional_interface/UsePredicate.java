package day45_functions_stream.functional_interface;

import java.util.function.Predicate;

/*
  Predicate
   */
public class UsePredicate {
 public static Predicate <String> isPalindrome = (str)->{
    //check is String str is palindrome(same from beginning and end)
    StringBuilder reversedStr = new StringBuilder(str);
    reversedStr.reverse();

    return str.equals(reversedStr.toString());
  };

 public static Predicate <Integer> isPrime = (num)->{

     //check if num is prime == divisible by itself and 1 ; divisible two times
     int count = 0;

     for (int i = 1; i <=num ; i++) {
         if(num%i==0){
             count++;
         }

     }
     if(count==2){
         return true;
     }else{
         return false;
     }
 };

}
