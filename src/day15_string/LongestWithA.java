package day15_string;

import java.util.Scanner;
//TODO: fix the booleans
public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();
//        boolean isFirstLongestWithA = word1.contains("a") && (word1.length() > word2.length() && word1.length()>word3.length());
//        boolean isSecondLongestWithA = word2.contains("a") && (word2.length() > word1.length() && word2.length()>word3.length());
//        boolean isThirdLongestWithA = word3.contains("a") && (word3.length() > word1.length() && word3.length()>word2.length());
//        if (isFirstLongestWithA) {
//            System.out.println(word1 + " is the longest with A");
//        }else if (isSecondLongestWithA) {
//            System.out.println(word2 + " is the longest with A");
//        }else if (isThirdLongestWithA)
//            System.out.println(word3 + " is the longest with A");
        boolean isFirstLongestWithA = word1.length() > word2.length() && word1.length() > word3.length();
        boolean isSecondLongestWithA = word2.length() > word1.length() && word2.length() > word3.length();
        boolean isThirdLongestWithA = word3.length() > word1.length() && word3.length() > word2.length();
        if (word1.contains("a")) {
            if (isFirstLongestWithA) {
                System.out.println(word1 + " is the longest with A");
            }
        } else if (word2.contains("a")) {
            if (isSecondLongestWithA)
                System.out.println(word2 + " is the longest with A");
        } else if (word3.contains("a")) {
            if (isThirdLongestWithA) {
                System.out.println(word3 + " is the longest with A");
            }
        } else {
            System.out.println("No words with \"A\"");
        }
    }
}