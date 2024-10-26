package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int y = 5;
        System.out.println(y);
        y = -y; //reassign to a new value. New value is the negative version of itself
        System.out.println(y);

        System.out.println("------------------");

        int x = 0;
        System.out.println(x);

        x = x + 1; //Here re-assigning a new value to x---> new value is adding 1 to itself
        System.out.println(x);

        System.out.println("--------------------");
        //PRE-INCREMENT - increasing it by 1

        ++x; //x = x +1;
        System.out.println(x); //2

        //POST-INCREMENT - increasing it by 1
        x++;
        System.out.println(x); //3
        System.out.println("-------------");
        //WHY WE HAVE 2 THE SAME WAY? -Sometimes we need to update the variable inside of the action/statement
        System.out.println(++x);
        //i got 2 actions in the print statement above
        //1.print statement
        //2. re-assigning x
       // System.out.println(x = x+1); WE CANNOT DO IT LIKE THIS

        System.out.println(x); //4

        System.out.println("-------------");
        //i got 2 actions in the print statement above
        //1.print statement
        //2. re-assigning x
        System.out.println(x++); //5---print (4) and THEN NEXT line POST-INCREMENT (5)
        System.out.println(x);   //5

        System.out.println("-------------");
        --x;
        System.out.println(x);
        x--;
        System.out.println(x);//3

        System.out.println("---");
        System.out.println(--x); //x=2
        System.out.println(x); //2

        System.out.println(x--); //2 (PRINT FIRST)
        System.out.println(x); //1


    }
}
