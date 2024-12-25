package day27_wrapper_array;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a = 5;

       // Integer a2= new Integer (10); //deprecated (not in use) after Java version 9
        Integer a3 = 20; //20--->int---->Integer----> Auto-Boxing
        int a4 = a3;

        System.out.println(a);
        System.out.println(a3);
        System.out.println(a4);
    }
}
