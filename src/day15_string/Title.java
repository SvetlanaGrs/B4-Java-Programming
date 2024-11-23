package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Please enter your name with titles: ");
        String name = key.nextLine().toLowerCase(); // Mr. Tom Jerry

        if (name.startsWith("mr.") || name.startsWith("mister")) {
            System.out.println("Hello Sir");
        }else if (name.startsWith("ms.") || name.startsWith("missis") || name.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        }else if (name.startsWith("dr.") && name.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }


        if (name.endsWith(" sr")){
            System.out.println("Nice to meet you Senior");
        }else  if ( name.endsWith(" jr")) {
            System.out.println("Nice to meet you Junior");
        }
    }
}
