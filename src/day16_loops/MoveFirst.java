package day16_loops;

import java.util.Scanner;

public class MoveFirst {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        System.out.print("Please enter a sentence: "); // Java is a fun language
        String sentence = key.nextLine();
        // use substring
        //P1:
       // sentence.substring(0,4)
        // 4---> need to make it dynamically----> find the index of first space
        // sentence.indexOf(" "); ----> index of first space
        String part1 = sentence.substring(0, sentence.indexOf(" "));
        String part2 = sentence.substring(sentence.indexOf(" ") + 1);// or we can use .trim()
        System.out.println(part2 + " " + part1);
        /*
        TODO: Home practice:
          Handle the case where user provides only single word as a sentence.
                If user provides single word -- > print the same word.

                Hint: .contains();
         */
    }
}
