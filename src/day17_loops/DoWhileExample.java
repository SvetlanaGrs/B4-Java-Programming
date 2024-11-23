package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        //DO WHILE loop
        int n = 100;
        do {
            System.out.println("DO WHILE: " + n);
        }while (n <= 10);

        //flow---->
        //1. execute code block
        //2. check condition

        // WHILE loop
        int m = 1;
        while (m <= 10) {
            System.out.println("WHILE: " + m);
            m++;
        }
        //flow -->
        // 1. check condition
        // 2. if true - execute the code block
    }
}
