package day24_methods;

public class MyFirstMethod {
    //It is public method
    //It is static method
    //It is void method ( does not return anything back - does some action
    //It is non-parameterized
    public static void printHelloWorld (){
        System.out.println("Hello World!");
    }

    public static void printHelloWorld50 ()  {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        printHelloWorld(); //I called the method printHelloWorld()
        printHelloWorld();
        printHelloWorld();

        System.out.println("Bye");

        printHelloWorld50();
        System.out.println("---------------------------------");
        printHelloWorld50();
    }


}
