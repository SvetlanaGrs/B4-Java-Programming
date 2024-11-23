package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
         int secretNumber = 777;
        Scanner key = new Scanner (System.in);
        int userGuess; //you need declare BEFORE do while

        do {
            System.out.print("Guess the number: ");
            userGuess = key.nextInt(); //777

            if(userGuess < secretNumber){
                System.out.println("It is too low");
            } else if (userGuess > secretNumber) {
                System.out.println("It is too high");
            } else {
                System.out.println("Guess Correctly");
            }

        }while (userGuess!=secretNumber);
        /*
        TODO: HOME PRACTICE
         In this code implement a logic that tells me after how may tries, I found the correct
                    - Print "After n-th try you guessed it."
         */

    }
}
