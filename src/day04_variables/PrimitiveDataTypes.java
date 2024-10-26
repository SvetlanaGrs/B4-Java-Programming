package day04_variables;

/*
    Data Types:
        1) Primitvie
            a) Integer type - byte, short, int, long
            b) Floating type - float, double
            c) Single Characters - char
            d) Boolean: true/False
        2)Non-primitive
        * Sequence of chars - String
 */


public class PrimitiveDataTypes {
    public static void main (String[] args){

        byte age = 34;              //Declared a variable called ages and data type
        System.out.println("age"); // "age" its not a variable name, its value itself
        System.out.println(age);   //age is a variable here. Data type is bite
        System.out.println(34);    //34 is value and BY DEFAULT it is a int data type. Because it whole number

        System.out.println("--------------------");
        short year;               //Declarea a variable
        year = 2024;              // Assigned a value
        System.out.println(year); //year is a variable here. Data type is short
        System.out.println(2024); // 2024 is a value and BY DEFAULT whole numbers are INT

        System.out.println("--------------------");

        int ipNumber = 123456;


        long accNumber = 1234567812345678L; // Declared a variable called accNumber and datatype is long, and assigned a value directly with "L" or "l" at the end of value
        System.out.println(accNumber);
    }
}
