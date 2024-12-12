package day25_methods;

import java.util.Arrays;
import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Please enter a number between 1 and 10:");
        int userNum = key.nextInt();
        returnString(userNum);
        System.out.println(numAsWord2(userNum));

    }

    public static void returnString (int num) {
        String[] numsAsWord = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        if (num<1 || num>10) {
            System.out.println("Not valid");
        } else {
            System.out.println(numsAsWord[num-1]);
        }

//        switch (num) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Ning");
//                break;
//            case 10:
//                System.out.println("Ten");
//                break;
//            default:
//                System.out.println("Not valid");
        }

        public static String numAsWord2 (int num) {
            String[] numsAsWord = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
            String result="";
            if (num<1 || num>10) {
                result="Not valid";
            } else {
                result=numsAsWord[num-1];
            }
        return result;
        }

}
