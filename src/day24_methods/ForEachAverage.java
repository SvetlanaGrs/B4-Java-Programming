package day24_methods;

import java.util.Arrays;

public class ForEachAverage {
    public static void main(String[] args) {
        int [][] numbers = {
                {3,4,5,6},
                {5,2,6},
                {10,20,30},
        };
        double totalSum = 0;
        int totalLength = 0;
        for (int [] each:numbers) {
            double summary =0;

            for (int eachElement:each){
               summary+=eachElement;

            }
            totalSum+=summary;
            totalLength+=each.length;

            System.out.println("Average of " + Arrays.toString(each) + " is " + summary/ each.length);

        }
        System.out.println("Average of 2D array: " + Arrays.deepToString(numbers) + " is " + totalSum/ totalLength);



    }
}
