package day39_a_polymorphism.poly_array;

import java.util.ArrayList;
import java.util.Arrays;

class A{
    @Override
    public String toString() {
        return "A";
    }
}

class B1 extends A{
    @Override
    public String toString() {
        return "B1";
    }

}

class B2 extends A{
    @Override
    public String toString() {
        return "B2";
    }

}

class C1 extends B1{
    @Override
    public String toString() {
        return "C1";
    }

}

class D {
    @Override
    public String toString() {
        return "D";
    }
}

public class Polymorphic_Array {
    public static void main(String[] args) {

        //Arrays -> size is fixed, store same data types, works with Primitive and Non-Primitive (object type)

        String [] str = {"a", "b", "c"};
        String [] str2 = {new String("a"), new String("b"), new String("c)")};
        int [] num = {1,2,3};
        Integer [] num2 = {1, 2, 3};

        D [] objArr1 = new D [4]; // created an Array of D to hold 4 elements ( has size of 4)
        objArr1[0] = new D(); // at the index of 0 --> hold this new D();
        objArr1[1] = new D(); // at the index of 1 --> hold another new D();
        System.out.println(Arrays.toString(objArr1));
       // objArr1 [2] = new C(); //since there is no relation --> C object can not be stored in the array the hold D type object


        A [] objArr2 = new A [4];
        //Polymorphic array
        //It can store any object of type of parent class
        objArr2 [0] = new A();
        System.out.println(Arrays.toString(objArr2));
        objArr2 [1] = new B1();
        objArr2 [2] = new B2();
        objArr2 [3] = new C1();
        System.out.println(Arrays.toString(objArr2));


        B1 [] objArr3 = new B1[4];
        objArr3[0] = new B1();
        objArr3[1] = new C1();
        //objArr3[2] = new D();    //D has not relation with B1 - so can not store
        //objArr3[3] = new A();    //A is bigger data type - so can not store in B1
        //objArr3[3] = (B1) new A(); //We can not Cast the object, we can cast the reference site. there will be .ClassCastException
        System.out.println(Arrays.toString(objArr3));


    }
}
