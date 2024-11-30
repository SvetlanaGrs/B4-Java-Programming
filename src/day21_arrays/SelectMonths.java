package day21_arrays;

import java.util.Scanner;

public class SelectMonths {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.println("Please enter a number and i will give you month name. ");
        String [] months = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec",};

        int userNum;
        do {
            System.out.print("Enter: ");
            userNum = key.nextInt();

            if (userNum>=1 && userNum<=12) {
                System.out.println(months [userNum-1]); //12
            }

        }while (userNum<1 || userNum>12) ;

    }
}
