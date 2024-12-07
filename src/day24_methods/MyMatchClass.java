package day24_methods;

public class MyMatchClass {
    public static void main(String[] args) {
        addition(12, 34);
        addition(50, 100);

        System.out.println();
        subtraction(20, 50);
        subtraction(55, 15);

        System.out.println();
        multiplication(2, 4);
        multiplication();

        System.out.println();
        division(2, 3);
        division(2, 0);
    }


    public static void addition(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplication() {

    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
    }

    public static void division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Not divisible by zero");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        }
    }
}
