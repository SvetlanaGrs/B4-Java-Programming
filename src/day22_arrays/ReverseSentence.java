package day22_arrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence= "today is monday";
        String [] sentenceArr = sentence.split(" ");
        System.out.println("Before reverse: " + Arrays.toString(sentenceArr));

        String reversed = "";
        for (int i = sentenceArr.length-1; i >=0 ; i--) {
            reversed+=sentenceArr[i] + " ";
        }
        reversed=reversed.trim();

        System.out.println(reversed);

        String [] reversedArr = reversed.split(" ");
        System.out.println("After reverse: " + Arrays.toString(reversedArr));
    }
}
