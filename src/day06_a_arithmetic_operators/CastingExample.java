package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {
        int num1 = 10;
        float num2 = num1; // going from SMALL to BIG // WIDENING CASTING //AUTOMATICALLY
        System.out.println(num1);
        System.out.println(num2);

        float num3 = 3.4f;
        short num4 = (short)num3; // going from BIG to SMALL //NARROWING//MANUALLY---->There might be a DATA LOSS
       // short num5 = (int)num3; //INT is bigger than SHORT----->WRONG
        short num6 = (byte)num3; //BYTE is smaller than SHORT---->OKAY
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num6);

       //We can convert CHAR into INT (ASCII/UNICODE)
        System.out.println();
        char letter = 'A';
        int letterInNum = letter; //going from SMALLER to BIG - NO NEED EXPLICIT CASTING
        System.out.println(letterInNum);
        System.out.println(letter);
        //We CANNOT
       // String letter2 = "B";
       // int letterInNum2 = letter2;

        System.out.println('C');
        System.out.println((int)'C');
        System.out.println((int)'%');




    }
}
