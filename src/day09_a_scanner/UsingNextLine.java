package day09_a_scanner;

import javax.swing.text.SimpleAttributeSet;
import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("What day is today? ");
        String day =  key.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = key.next();

        System.out.println("Enter your last name: ");
        String lastName = key.next();

        key.nextLine(); // To handle the ENTER issue

        System.out.println("Enter your address: ");
        String address = key.nextLine();

        //Rule with .nextLine-->If there are ANY OTHER SCANNER methods than .nextLine(), right before nextLine(), we need to handle it with extra .nextLine();

        System.out.println("Please enter Job Titles: ");
        String jobTitles = key.nextLine();

        System.out.println("Please enter couple names: ");
        String names = key.nextLine();

        System.out.println("Enter your favourite number");
        int favNum = key.nextInt();

        key.nextLine(); // To handle the ENTER issue

        System.out.println("Enter couple words");
        String coupleWords = key.nextLine();

    }
}
