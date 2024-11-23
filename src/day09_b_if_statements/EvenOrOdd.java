package day09_b_if_statements;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        boolean isEven = num % 2 ==0;
    //    boolean isOdd = num % 2 !=0;

//        System.out.println(num + " is Even: " + isEven);
//        System.out.println(num + " is Odd: " + isOdd);

        //2nd way to do it\/

        if (isEven){
            System.out.println(num + " is even");
        }
        if (!isEven){
            System.out.println(num + " is odd");
        }
    }
}
