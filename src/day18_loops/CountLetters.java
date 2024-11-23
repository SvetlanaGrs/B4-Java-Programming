package day18_loops;

public class CountLetters {
    /*

    Given a String we want to count how many 'a' characters we have

    Todo: Challenge: adjust so that we can check for not only 'a' but any character

    Ex: aabbcaa

        4

 */
    public static void main(String[] args) {
        String word = "aabbcaa";
        char letter = 'b';
        int count = 0;
        
        /* ON INTERVIEW THEY CAN ASK
        I would loop through the characters/ letter and check 1 by 1 if it is equal
        If it is equal, i would count
         */

        for (int i = 0; i <= word.length()-1 ; i++) {
            if (word.charAt(i)==letter ) { //cause Every char has ASCII *** a ==a | a==a ||b == a || ...

                count++;


            }
        }
        System.out.println("In " +word + " we have " + count + "\'" +  letter + "\' character");

    }
}
