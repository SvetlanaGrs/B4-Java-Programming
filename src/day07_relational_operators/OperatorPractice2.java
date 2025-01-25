package day07_relational_operators;

public class OperatorPractice2 {
    public static void main(String[] args) {
        int t = 100;

        int p = - ++t * t-- / t++ + --t; // - (101 * 101 / 100) +100 = -2
        System.out.println(t);
        System.out.println(p);
    }
}
