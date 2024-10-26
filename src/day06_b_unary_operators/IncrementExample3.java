package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i = 5;
        int z = i++;  //i=i+1 re assignment
        // Two actions above
        //1 - assignment  ---> z=5
        //2 - Increment (POST)--->i=i +1

        System.out.println(i);
        System.out.println(z);

        System.out.println();
        int a = 10;
        int b = a + 1; //a + 1 --> its not a=a+1-- not reassignment
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        int c = ++a;
        //Pre increment
        //1. update--- a = a+1 ---> a=11
        //2. use---> c=11
        System.out.println(a);
        System.out.println(c);
    }
}
