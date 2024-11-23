package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("What day do you want to know about? ");
        String day = key.next();
        String information;

        switch (day) {
            case "Monday": case "Mon": case "MONDAY": case "mon": case "MON":
                information = "We have mentor sessions on Monday!";
                break;
            case "Tuesday":
            case "Friday":
                information = "We do not have a class!";
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                information = "Beautiful day. Java class";
                break;
            case "Sunday":
                information = "Beautiful day. Soft skills class.";
                break;
            default:
                information = "Not valid.";
        }
        System.out.println(information);
    }
}
