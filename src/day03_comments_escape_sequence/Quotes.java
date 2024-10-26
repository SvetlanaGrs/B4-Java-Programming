package day03_comments_escape_sequence;

public class Quotes {
    public static void main (String[] args) {
        System.out.println("Everyone loves Java Programming");

        /*
        Q: Hoe if i want to print it with double quotes likes below
        -Everyone loves "Java" Programming
         */

        System.out.println("Everyone loves \"Java\" Programming");

        System.out.println("\"Everyone loves Java Programming\"");

        /*
        Since we use backword slach as part of the syntax, then how i pering backward slash itself
        -There programming languages like java\python
         */

        System.out.println("There programming languages like java\\\\python");
        System.out.println("There programming languages like java/python");


    }
}
