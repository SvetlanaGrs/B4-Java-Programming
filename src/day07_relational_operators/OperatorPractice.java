package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int b = 12;
        b++; //b= b+1; ----> b=13
        System.out.println(b);
        ++b; // PRE-increment--- b= b+1; ----> b=14
        System.out.println(b);
        b--; //Post-decrement
        System.out.println(b); //13
        --b; // Pre-decrement
        System.out.println(b);

        System.out.println(b++); //12
        System.out.println(b);
        System.out.println(++b); //14
        System.out.println(b);
        System.out.println(--b); //13

    }
}
