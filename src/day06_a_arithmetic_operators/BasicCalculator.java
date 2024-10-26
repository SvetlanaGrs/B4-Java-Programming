package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 3; // the value 3 is INT. Double can hold Int. IMPLICIT CASTING (WIDENING CONVERSION) is happening
        double num2 = 2;

        double addition = num1 + num2; //3.0+2.0
        //int subtraction = num1-num2; //int cannot hold double
        //int subtraction = (int)num1-(int)num2); //3-2---->1 (int)
        //int subtraction2 = (int)(num1-num2); // (3.0-2.0)--->1.0(double)---->1
        double subtraction = num1 - num2;
        double miltiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2; //modules

        System.out.println(num1 + " + " + num2 +" = " + addition);
        System.out.println(num1 + " - " + num2 +" = " + subtraction);
        System.out.println(num1 + " * " + num2 +" = " + miltiplication);
        System.out.println(num1 + " / " + num2 +" = " + division);
        System.out.println(num1 + " % " + num2 +" = " + remainder);

        num1 = 13;
        num2 = 5;
        remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 +" = " + remainder);


        System.out.println("-------------------------------");

        System.out.println(3.4 +1); //double + int ---> double

        int a = 5;    //5
        double d = 4; //4.0
        System.out.println(a + d); // 5 + 4.0 --->int + double----> double

        byte b = 3;
        short s = 2;
        System.out.println(b * s); // result is going to be INT (by default)--- It's working only with BYTE and SHORT
        byte b1 = 4;
        short s2 = 5;
        //short r = b1 * s2; //20, but not short-----ONLY INT, cannot be stored into short without CASTING.( Because COMPILER takes the whole number as int by default)
        short r = (short)(b1*s2); // 20--->int---->short

        double result2 = b1 + s2; //byte + short--> int --> storing it into double is OK. WIDENING CASTING (CONVERSION) from small to big







        System.out.println("-------------------------------");
        System.out.println();
        int i1 = 3;
        int i2 = 2;
        int div = i1 / i2;
        double div2 = i1/i2;
        System.out.println(div);
        System.out.println(div2);
    }
}
