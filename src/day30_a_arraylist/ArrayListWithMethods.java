package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());

        ArrayList <String> weekDays = getDaysOfWeek();
        printElements(weekDays);

    }


    public static void printElements (ArrayList <String> list) {
        System.out.println("LIST:");
        for (String each:list) {
            System.out.println("\t" + each);
        }
    }


    public static ArrayList<String> getDaysOfWeek () {
        ArrayList <String> weekDays = new ArrayList<>(Arrays.asList("Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"));

        return weekDays;
    }

}
