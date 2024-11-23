package day14_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        //Class name-objectReference name =actual object
        System.out.println("Enter a message: ");
        String message = key.nextLine();
        //String message = key.nextLine().trim().toLowerCase();   // OTHER OPTION

        //Option 1 with if else
        message = message.trim().toLowerCase();
        boolean badPhrases = message.contains("java is bad")|| message.contains("quit")|| message.contains("have fun")|| message.contains("crying");
        if (badPhrases) {
            System.out.println("Message failed to sent");
        } else {
            System.out.println( "\"" + message + " sent");
        }

        //Option 2 with ternary
       // System.out.println(badPhrases ? "Message failed to sent " : ("\"" + message + " sent"));
    }
}
