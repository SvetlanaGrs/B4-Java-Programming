package day20_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userNum = key.nextInt(); //50
        String prime = "";

        for (int i = 1; i <= userNum; i++) {
            int count =0;

            for (int j = 1; j <=i ; j++) {

                if(i%j==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.print(i + " ");
            }
        }
    }
}
