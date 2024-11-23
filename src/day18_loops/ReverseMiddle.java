package day18_loops;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Give me a sentence with at least 3 words:");
        String sentence = key.nextLine().trim();

        //How check 3 words?
        int countSpace = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ');
            countSpace++;
        }
        if (countSpace>=2) { // i have at least 3 words
            int firstSpaceIndex = sentence.indexOf(" ");
            int lastSpaceIndex = sentence.lastIndexOf(" ");
            String middle =  sentence.substring(firstSpaceIndex+1,lastSpaceIndex );
            String reverse = "";
            for (int i = middle.length()-1; i >=0 ; i--) {
                reverse +=middle.charAt(i);
            }

            System.out.println(  sentence.substring(0,firstSpaceIndex) + " " + reverse + " " + sentence.substring(lastSpaceIndex+1));

        }else {
            System.out.println("You have not provided a sentence which has 3 words");
        }
    }
    /*
            TODO: Home Practise: Improve this code
                As a user to enter a sentence with at least 3 words until user gives it to you.
         */


}
