package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = key.nextLine();

        System.out.println(sentence.charAt(0)); //This is not Concatenation or Addition---> Print normally char
        System.out.println(0 + sentence.charAt(0)); //This is not CONCATENATION but ADDITION---> Print calculation 0 + 74 (ASCII for J)

        System.out.println(sentence.charAt(sentence.length()-1)); //This is not CONCATENATION or ADDITION---> Print normally char
        System.out.println(0 + sentence.charAt(sentence.length()-1)); //This is not CONCATENATION but ADDITION---> Print calculation 0 + 101 (ASCII for e)


        System.out.println("First char: " + sentence.charAt(0));  // THIS IS CONCATENATION----WE SEE CHAR
        System.out.println("Last char: "+ sentence.charAt(sentence.length()-1));// THIS IS CONCATENATION----WE SEE CHAR

        /*
        TODO: get the last char and 2nd last char and check if they are same
                If they are - print "Double same chars at th end"
                If not - pring last two chars are not same
         */
    }
}
