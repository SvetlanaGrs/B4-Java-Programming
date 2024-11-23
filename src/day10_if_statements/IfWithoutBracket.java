package day10_if_statements;

public class IfWithoutBracket {
    public static void main(String[] args) {
        if (5 < 1) {
            System.out.println("Hi1");
            System.out.println("Bye1");
        }
// If without bracket you can only have 1 statement
         if (5 > 1) System.out.println("Hi2");

        System.out.println("----------------------------");

        if (4>2) {
            System.out.println("loop-1");
        } else {
            System.out.println("loop-2");
            System.out.println("loop-3");
        }

    }
}
