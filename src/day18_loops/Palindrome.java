package day18_loops;

public class Palindrome {
    public static void main(String[] args) {
        String word = "ana"; //we know EXACT length
        String reversedWord = "";
        /*
        check the originalWord is SAME with reversedWord
        1. reverse the word
        get each char from end and put the beginning
        .charAt()
         */
        // initialization;condition;iteration
        for (int i = word.length()-1; i >= 0 ; i--) {
//            System.out.print(word.charAt(i) );
            reversedWord += word.charAt(i); // a | a+v | av+a | ava+ j
        }
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println("It is PALINDROME");
        }else {
            System.out.println("It is not PALINDROME");
        }

        //compare two words
        //original vs reverse

        //WITH TERNARY
        System.out.println(word.equalsIgnoreCase(reversedWord) ? "It is PALINDROME" : "It is not PALINDROME");

    }
}
