package day05_variables;

public class CharExamples {
    public static void main (String[] args){
        // declaring and initializing
        char letter1 = 'a';
        char letter2 = 'Z';
        char letter3 = '9';
        char letter4 = '%';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);

        System.out.println(letter1 + letter2); // 'a' + 'Z' ----> 97+90=187 (ASCII)
        System.out.println(""+ letter1 + letter2); //everything after first ""- concatenation

        // Another way to declare char with numbers from ASCII/UNICODE table
        char letter5 = 84;
        System.out.println(letter5);
        char letter6 = 2345;
        System.out.println(letter6);

        System.out.println(letter1+letter2+letter3+letter4);           //281----> compiler is doing addition
        System.out.println("Chars:" +letter1+letter2+letter3+letter4); // Chars:aZ9%----> because of Concatenation



    }
}
