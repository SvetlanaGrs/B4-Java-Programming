package day07_relational_operators;

public class ShortAndOperators {
    public static void main(String[] args) {
        int a = 10; // declared and initialized  (assigned first value)
        a = 20;     // reassigned a new value
        a++;        // reassigned by POST Increment
        ++a;
        a = a + 1;

        a = a + 10;
        a += 10;  // SHORT HAND OPERATOR - reassign
        System.out.println(a);
        a = 10 + 23; // a = a + 23


        System.out.println();
        int b = 2;
        b *= 3; //2*3
        System.out.println(b);
        System.out.println();
         int c = 10;
         c %= 3; // c = c % 3;----->c = 10 % 3....=1
        System.out.println(c);
    }
}
