package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {
        //break
        //continue

        System.out.println(" Traditional For loop / fori loop without break or continue");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(" Traditional For loop / fori loop with break ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            break;
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();
        System.out.println(" Traditional For loop / fori loop with continue");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            continue;
            //System.out.println("Hi");  // Never reaches after continue
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                continue;
            }
            System.out.println("Hi");
        }
        System.out.println();
        for (int i = 1; i <10 ; i++) {
            if (i%2 ==1) { //If num is ODD --->continue to the next iteration
                continue;
            }
            //Print only even numbers
            System.out.print(i + " ");

        }
    }
}
