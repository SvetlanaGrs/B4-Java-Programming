package day07_relational_operators;

public class AllOperators {
    public static void main(String[] args) {

        System.out.println(5 + 2 * 4); //5+ 8--->13
        System.out.println( 5 *2 + 6 / 2); //10 +3 = 13
        System.out.println( 5 + 2 > 4 + 6); // 7 > 10 ---> >/< use after +/-

        int a = 20;
        int b = -a-- + a++ + --a*a--; // -20+19+ (19*19) = -1 + 19 * 19 = 360
        System.out.println(a); //18
        System.out.println(b); //360

    }
}
