package day33_a_static;

import java.util.Arrays;

public class LoopcampStudent {
    //instance variables
    String name;
    String groupNumber;
    String mentor; //Diana, Iryna

    //static variables
    static int batchNumber;
    static int courseLengthInMonth;
    static String schoolName;
    static String [] teachers; //["Nadir", "Feyruz"]

    //Static block helps to initialize static variables
    static {
        batchNumber=4;
        courseLengthInMonth=6;
        schoolName="Loopcamp";
        teachers=new String[] {"Nadir", "Feyruz"};
        printStaticInfo();
    }

    public LoopcampStudent(String name, String groupNumber, String mentor) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.mentor = mentor;
    }

    public static void printStaticInfo (){
        System.out.println("School info: " );
        System.out.println("\tSchool name: " + schoolName);
        System.out.println("\tBatch number: " + batchNumber);
        System.out.println("\tCourse length: " + courseLengthInMonth);
        System.out.println("\tTeachers: " + Arrays.toString(teachers));
        //mentor

    }

    @Override
    public String toString() {
        return "LoopcampStudent Info: " +
                "\t\tname = " + name  +
                "\t\tgroupNumber = " + groupNumber  +
                "\t\tmentor = " + mentor ;
    }
}
