package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

//I will use this class as a runner class( with main method)
public class AllPeople {
    public static void main(String[] args) {

        //This is local variable
        //It is inside of method
        String name2;

        //Can NOT use it directly, because does not have initial value. Can not
        //System.out.println(name);

        //These are not VALID name to reach those variables
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(height);
//        System.out.println(isMarried);

        //Sample object creation we have seen so far
        //Reference side        =   Object side
        Scanner key             =   new Scanner(System.in);
        String str              =   new String("Hello");
        ArrayList <String> list =   new ArrayList<>();
        String [] strArr        =   new String[5];


        //Reference side        =   Object side
        Person person1          =   new Person();
        Person person2          =   new Person();
        Person person3          =   new Person();
        Person person4          =   new Person();
        Person person5          =   new Person();
        Person person6          =   new Person();
        Person person7          =   new Person();

        //How can i access to those INSTANCE variables?
        //Need to create the object to access them
//        String str2 = new String ("123456");
//        System.out.println(str2.charAt(0));
//        System.out.println();
//        Integer.parseInt(str2);
//        Integer.valueOf(str2);



        System.out.println("Person 1 info: ");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println();

        System.out.println("Person 2 info: ");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);

        //Lets give Person1 some info
        person1.name = "Tom";
        person1.age = 30;
        person1.height = 6.1;
        person1.isMarried = true;

        //Lets give Person2 some info
        person2.name = "Winnie";
        person2.age = 25;
        person2.height = 6.2;
        person2.isMarried = false;

        System.out.println("--------------------------------------");
        System.out.println("Person 1 info: ");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println();

        System.out.println("Person 2 info: ");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);

        System.out.println();

        System.out.println("Person 3 info: ");
        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.height);
        System.out.println(person3.isMarried);
    }

}
