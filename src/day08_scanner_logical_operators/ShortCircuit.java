package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {

        int i = 10;

        //Difference between && vs & ------ || vs |
        System.out.println(true &&++ i > 5);
        //                true & 11>5 (true)
        //                      true

        System.out.println(i);
        System.out.println("--------------------");

        int y = 10;
        System.out.println(false & ++ y > 5);
        //                true & 11>5 (true)
        //                      true


        System.out.println(y);

        int x = 10;
        System.out.println(true && ++ x > 5);
        System.out.println(x);

    }
}
