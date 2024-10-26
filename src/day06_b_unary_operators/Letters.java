package day06_b_unary_operators;

public class Letters {
    public static void main(String[] args) {
        char letter = 'G';

        System.out.println(letter++); //POST---->letter = letter +1--->letter = 71 +1
        System.out.println(letter++);
        System.out.println(letter); // I
        System.out.println(++letter); //PRE---update first----then use---> J
    }
}
