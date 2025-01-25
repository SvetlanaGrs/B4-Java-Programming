package day39_a_polymorphism.book;

import day38_ab_polymorphism.animal.Animal;
import org.w3c.dom.ls.LSOutput;

public class Library {
    public static void main(String[] args) {
        //Possible references of JavaTextBook:itself,Ebook(parent),Book(parent/ like grandparent),Downloadable(interface)
        JavaTestBook b1 = new JavaTestBook();
        //access to variables
        b1.isFun=true;
        b1.storageSize=124;
        b1.name="Java Programming";
        //access to instance methods :
        b1.open();
        b1.read();
        b1.download();

        System.out.println("----------------------------------");
        EBook b22 = b1; //UPCASTING - implicitly (Automatically). Limitied the access of b1 if you use b22 as reference
        EBook b2 = new JavaTestBook();
        //access to variables
       // b2.isFun=true; Refference Ebook doesnt have access to the isFun();
        ( (JavaTestBook) b2 ).isFun=true; //Downcasted Ebook reference to JavaTextBook so i can access to the members JavaTextBook class

        b2.storageSize=124;
        b2.name="Java Programming";
        //access to instance methods :
        b2.open();
        b2.read();
        b2.download();

        System.out.println("----------------------------------");

        Book b3 = new JavaTestBook();
        //access to variables
        // b3.isFun=true;   Refference Book doesnt have access to the isFun();
        //((EBook)b3).isFun=true; //DOWNCASTED to EBook but Ebook doesnt have access to isFun
        ((JavaTestBook)b3).isFun=true;
        //b3.storageSize=124;Refference Book doesnt have access to the storageSize;
        ((EBook)b3).storageSize=124;
        ((JavaTestBook)b3).storageSize=124;
        b3.name="Java Programming";
        //access to instance methods :
        //b3.open();   Refference Book doesnt have access to the open();
        ((EBook)b3).open();
        ((JavaTestBook)b3).open();
        b3.read();
        //b3.download();    Refference Book doesnt have access to the download();
        ((EBook)b3).download();
        ((JavaTestBook)b3).download();

        System.out.println("-----------------------------------------");
        Downloadable b4 = new JavaTestBook();
        //access to variables
        //.isFun=true;     //Reference Downloadable doesnt have access to isFun();
        //((EBook)b4).isFun=true;//DOWNCASTED to EBook - Reference Downloadable doesnt have access to isFun();
        ((JavaTestBook)b4).isFun=true;//DOWNCASTED to JavaTextBook - Reference Downloadable does have access to isFun();
        //((Book)b4).isFun=true;//NO Direct relation - No need casting like this


        //b4.storageSize=124;//Reference Downloadable doesnt have access to storageSize;
        ((EBook)b4).storageSize=124;//DOWNCASTED - Reference Ebook has access to storageSize;
        ((JavaTestBook)b4).storageSize=124;//DOWNCASTED - Reference JavaTestBook has access to storageSize;


       // b4.name="Java Programming";//Reference Downloadable doesnt have access to name;
        ((EBook)b4).name="Java Programming";
        ((JavaTestBook)b4).name="Java Programming";


        //access to instance methods :
       // b4.open(); //Reference Downloadable doesnt have access to open);
       // b4.read(); //Reference Downloadable doesnt have access to read();

        //ALL the rules with instance variables applies to these methods as well for accessibility

        b4.download();

        System.out.println("-----------------------------------------");
        System.out.println(b1 instanceof JavaTestBook);// instanceof ---> object of
        System.out.println(b2 instanceof JavaTestBook);
        System.out.println(b2 instanceof EBook);
        System.out.println(b2 instanceof Book);
        System.out.println(b4 instanceof JavaTestBook);
        System.out.println(b4 instanceof Animal);
        System.out.println(b4 instanceof Book); //WILL BE TRUE STILL - even there no direct relation


    }
}
