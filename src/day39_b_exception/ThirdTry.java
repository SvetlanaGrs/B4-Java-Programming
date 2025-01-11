package day39_b_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the number:");
            int userNum = scanner.nextInt();         //.InputMismatchException

            System.out.print("Enter another number:");
            int userNum2 = scanner.nextInt();        //.InputMismatchException

            System.out.println(userNum/ userNum2);   //.ArithmeticException

        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Finish line");
    }
}
