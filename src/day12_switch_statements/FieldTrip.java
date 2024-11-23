package day12_switch_statements;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        int grade;
        String teacherName;
        String location;
        int numOfGroups;
        Scanner key = new Scanner (System.in);
        System.out.print("What ia the grade you want to get a field trip info: ");
        grade = key.nextInt();

        // grade from 1 to 6----> Mr. Nadir | Apple Orchard | 3
          // grade 1 --->
          // grade 2 --->
          // grade 3 --->
          // ....... --->
        // all the other grades----> Mr. Banjamin | Fireworks | 10

        if (grade >=1 && grade <=6) {
            teacherName = "Mr. Nadir";
            location = "Apple Orchard";
            numOfGroups = 3;

            if (grade ==1) {
                teacherName = "Ms. Jessica";
                location = "Zoo";
                numOfGroups = 4;
            } else if (grade ==2) {
                teacherName = "Ms. Casey";
                location = "Movie";
                numOfGroups = 5;
            } else if (grade ==3) {
                teacherName = "Mr.Tom";
                location = "Museum";
                numOfGroups = 7;
            } else if (grade == 4) {
                teacherName = "Mr. Jerry";
                location = "Aquarium";
                numOfGroups = 9;
            } else if (grade == 5) {
                teacherName = "Mr. Winnie";
                location = "Disneyland";
                numOfGroups = 2;
            } else {
                teacherName = "Mr. Pooh";
                location = "Concert";
                numOfGroups = 3;
            }


        }else {
            teacherName = "N/A";
            location = "N/A";
            numOfGroups = 0;
        }
        System.out.println("\nHere is field trip info for grade " + grade);
        System.out.println("\tTeacher name: " + teacherName);
        System.out.println("\tLocation " + location);
        System.out.println("\tNumber of groups " + numOfGroups);
    }
}
