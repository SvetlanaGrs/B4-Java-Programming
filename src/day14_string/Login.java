package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String expectedUserName = "java234.@gmail";
        String expectedPassword = "loopcamp";

        Scanner key = new Scanner (System.in);
        System.out.print("Enter your username: ");
        String inputUserName = key.next();
        //String inputUserName = key.next().toLowerCase(); ALSO CAN USE IT

        System.out.println("Enter a password: ");
        String inputUserPassword = key.next();

        boolean isValid = inputUserName.equalsIgnoreCase(expectedUserName) && inputUserPassword.length()==8 && inputUserPassword.equals(expectedPassword);
        if (isValid) {
            System.out.println("Logged in");
        }else {
            System.out.println("INVALID");
        }



    }
}
