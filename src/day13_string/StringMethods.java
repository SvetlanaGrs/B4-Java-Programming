package day13_string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
//        Scanner key = new Scanner (System.in);
//        key.nextInt();

        String name1 = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");

        //==----> This will compare memory location
        System.out.println(name1 == name2);// true
        System.out.println(name1 == name3);// false
        System.out.println(name2 == name3);// false

        System.out.println("---------------------");

        //.equals() ---> this will compare String value including case sensitivities
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name1.equals(name3));
        System.out.println("Micky".equals(name1));
        System.out.println((name1).equals("Micky" ));
        System.out.println(new String("Micky").equals(name1));
        System.out.println("Micky".equals(new String("Micky")));
        System.out.println((new String("Micky").equals("Micky")));

        String word1 = "Monday";
        String word2 = new String ("MONDAY");
        System.out.println("Comparing values: " + word1.equalsIgnoreCase(word2));
        String word3 = "Mon";
        System.out.println(word1.equalsIgnoreCase(word3));

        System.out.println("---------------");
        String school = "Loopcamp";
        System.out.println(school.length());
        int numOfChars = school.length();
    }
}
