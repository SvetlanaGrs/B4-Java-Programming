package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {
      // String str= sayHi(); // Since this method is a void method - it DOES NOT return anything back
        sayHi();

        System.out.println();
        sayHi2();
        System.out.println(sayHi2());

        String str = sayHi2();
        System.out.println(str);
    }

    //This is a void method, which means does not return anything
    public static void sayHi() {
        System.out.println("Hi");
    }

    //This is return type method - which means it returns something. Something can be any data type
    public static String sayHi2 () {
        String str = "Hi"; //local variable
        return str;
    }
}
