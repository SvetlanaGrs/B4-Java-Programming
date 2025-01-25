package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {
        // print "Hello Loopcamp!" 5 times

        //with loop
        for (int i = 1; i <=5  ; i++) { //or i<=4
            System.out.println("Hello Loopcamp!");
        }

        System.out.println("**************************************");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("**************************************");

        /*
        Hello Galaxy
        Hello Moon
        Hello Moon

        Hello Galaxy
        Hello Moon
        Hello Moon
         */

        for (int i = 1; i <=3 ; i++) {          //OUTER LOOP

            System.out.println("Hello Galaxy");
            for (int j = 1; j <= 2; j++) {      //INNER LOOP
                System.out.println("Hello Moon");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        //Every cycle of outer loop inner loop happens 6 times
        for (int i = 0; i < 3; i++) {      //OUTER LOOP

            for (int j = 0; j < 6; j++) {  //INNER LOOP
                System.out.println("10");
            }
            System.out.println();
        }
    }

}
