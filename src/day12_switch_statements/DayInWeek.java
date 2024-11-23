package day12_switch_statements;

import java.util.Scanner;

public class DayInWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numInWeek;
        System.out.print("Please enter a day in number that represents a week day: ");
        numInWeek = key.nextInt();
        String day;

        switch (numInWeek) { //String,char,int,short,bite
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
            case 7:
                day = "Weekend";
                break;
            default:
                day = "Not valid";
        }
        System.out.println(day);
    }
}
