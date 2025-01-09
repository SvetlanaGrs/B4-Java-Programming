package day37_a_abstraction.book;

import day35_inheritance.super_parathesis.B;

public class Runner {
    public static void main(String[] args) {
        //We can not create object of interface. Same as abstract class
        //Create obj = new Create();

        Book obj =new Book();
        obj.read();
        obj.write();
        System.out.println(obj.NAME);//Not proper way
        System.out.println(Book.NAME); // proper way
        System.out.println(Create.NAME); // The purpose of interface is to provide additional information (abstraction)

    }

}
