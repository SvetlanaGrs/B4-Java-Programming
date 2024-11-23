package day10_if_statements;

public class CheckChar {
    public static void main(String[] args) {

            char letter = 'J';

            if (97 < letter && letter < 122) {
                System.out.println(letter + " is lower case");
            }

            if ('A' <= letter && letter <= 'Z') {
                System.out.println("UPPER CASE LETTER");
            }
        }
    }

