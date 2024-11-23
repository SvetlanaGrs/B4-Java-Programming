package day17_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Hey, how many numbers do you want to compare:");
        int countOfNum = key.nextInt();
        int cycle = 1;
        int userNum=0;

        int biggest=-2147483648; //int biggest = Integer.MIN_VALUE; Its the same, FANCY way
        int smallest = 2147483647;

//        System.out.println(Integer.MAX_VALUE);  //2147483647 --> Inside of this int class, there is a way to get the MAX number
//        System.out.println(Integer.MIN_VALUE);  //-2147483648--> Inside of this int class, there is a way to get the MIN number

        while (cycle <=countOfNum) {
            System.out.print("Please enter a number: " + cycle + ": ");
            userNum = key.nextInt();


            if(userNum > biggest) {
            biggest = userNum;
            }
            if (userNum<smallest) {
                smallest=userNum;
            }

            cycle++;
        }
        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest" + smallest);

    }
}
