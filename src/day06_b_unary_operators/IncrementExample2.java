package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {

        int age = 30;
        System.out.println(age);   //30
        System.out.println(age++); //POST-INCREMENT--->print first--->30---->than update
        System.out.println(age);   //now it 31

        System.out.println(age++); // 31
        System.out.println(age++); //32
        System.out.println(age);   //33

        System.out.println(++age); //Pre-increment--->update first--> 34 ---> PRINT

        System.out.println(--age); //Pre-decrement--->update first-->33--->print
        System.out.println(age);   //33
        System.out.println(age--); //POST-DECREMENT-->print first-->33-->update
        System.out.println(age);   //32
        /*
        PRE
        -update then use
        POST
        -USE then update
         */

    }
}
