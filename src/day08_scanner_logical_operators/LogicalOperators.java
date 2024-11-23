package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int n = 10;

        System.out.println( n > 5);  //true ---- this is a single different single statement
        System.out.println( n < 20); //false ---- this is a single different single statement

        System.out.println(n > 5 && n < 20); // this is a single statement using logical and relational operators
        //                 false && n true
        //                 false && true
        //                      false


        System.out.println("--------------------------");

        System.out.println( 6 > 1 || false);
        //                  true || false
        //                  true

        System.out.println( 1 > 5 || false);
        //                  false || false -----> false

        System.out.println("--------------------------");

        System.out.println(true);
        System.out.println(!true);  // NOT OPERATOR ---> Not true --- > False
        System.out.println(false);
        System.out.println(!false);

        System.out.println( !(6 != 6));
        // ( 6 ! = 6) false
        //!false --- > true

    }
}
