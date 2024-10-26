package day03_comments_escape_sequence;

public class VariableIntro {
    public static void main (String[] args) {
        //option 1
        int num1; //DECLARED VARIABLE called num1 and int data type
        num1 = 6; // ASSIGNED VALUE/DATA into variable
        System.out.println(4);
        System.out.println(num1);

       //int num1 // WE CAN NOT DECLARE SAME VARIABLE NAME more than once
        num1 = 10; // RE-ASSIGNMENT- I gave another value to already declared variable

        System.out.println(num1);

        //num2=50; // You can not declared ONLY variable name without Data Type

        // Option 2
        int num2 = 30; // DECLARED VARIABLE and ASSIGNED VALUE/DATA in one statement
        System.out.println(num2);
        System.out.println(20);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        num2=40;
        System.out.println(num2);


        System.out.println(4); //here data type int, by default
        byte n1 = 4; //here data type byte
        short n2=4;
        int n3 = 4;
        long n4 = 4;
        long n5 = 8000000000L; //USE L at the end

        //------------------------------------------------------------------------

        System.out.println("-------------------------------------------------");
        System.out.println(4.5); // By default it is double

        float d1 = 3.6f;
        double d2 = 3.6;
        System.out.println(d1);
        System.out.println(d2);

        char letter1;
        letter1 = 'a'; // IN SINGLE QUOTES we can not use one more than ONE character
        System.out.println(letter1);
        String letter2 = "a"; // In double quotes we can use more than one character
        String letter3 = "aa";
        char letter4 = '$';
        System.out.println(letter4);


        System.out.println("---------------------------------------------");
        boolean varName = true;
        System.out.println(varName);
        varName = false;
        System.out.println(varName);
        //varName = correct; // It only can hold either true or false
        //varName = 12

        System.out.println("---------------------------------------------");
        //Sample string
        String word = "Apple"; // Here i declared string variable and assigned "Apple" value to it.
        System.out.println(word);
        System.out.println("Apple"); // Here i printed out a String value directly

        System.out.println("---------------------------------------------");
        int totalPrice;

        int apple = 5;
        int bread = 25;

        totalPrice = apple+bread;
        System.out.println(totalPrice);

    }
}