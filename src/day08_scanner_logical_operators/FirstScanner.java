package day08_scanner_logical_operators;

import java.util.Scanner;


//step 1 - We need to import to be able to use a class outside of the package
import java.util.Scanner;

    public class FirstScanner {

        public static void main(String[] args) {

            //Scanner input;  ---> input is a object reference name (NON-primitive / OBJECT type0
            // int a;         ---> a is variable name (because data type PRIMITIVE data type i)

            //2 step is - Declaring  and instantiating Scanner Object---> will help us to get the info from the user/console
            Scanner input = new Scanner(System.in);
            System.out.println("How old are you?");
            int userAge = input.nextInt();
            System.out.println("I am " + userAge + "years old.");
        }
}
