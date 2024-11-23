package day14_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Enter a website: ");
        String website = key.next().toLowerCase();
        boolean isValidBeggining = website.startsWith("www") ;


        boolean isValidEnd = website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov")||website.endsWith(".net")||website.endsWith(".io");

        if (isValidBeggining&&isValidEnd) {
            System.out.println("It is valid website");
        } else {
            System.out.println("Its not valid");
            if (!isValidBeggining) {
                System.out.println("Invalid beggining");
            }
            if (!isValidEnd) {
                System.out.println("Invalid ending");
            }
        }
    }
}
