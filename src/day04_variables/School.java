package day04_variables;

public class School {
    public static void main(String[] args) {
        int numberOfStudentsInGrade1 = 25;
        int numberOfStudentsInGrade2 = 15;
        int numberOfStudentsInGrade3 = 10;
        int numberOfStudentsInGrade4 = 5;
        int numberOfStudentsInGrade5 = 6;

        int totalStudentNumber = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 +numberOfStudentsInGrade5;
        System.out.println(totalStudentNumber);

        double numOfDaysInAYear = 100.5;
        double numOdSnowDays = 12.5;
        double averageGpa = 3.5;

        System.out.println("Number of students in Grade 1: "+ numberOfStudentsInGrade1);
        System.out.println("Number of Students In Grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of Students In Grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of Students In Grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of Students In Grade 5: " + numberOfStudentsInGrade5);
        System.out.println();

        System.out.println("Total student number in our school:\t\t"+ totalStudentNumber);
        System.out.println("Number of school days:\t\t\t\t\t"+ numOfDaysInAYear);
        System.out.println("Number of snow days:\t\t\t\t\t"+ numOdSnowDays);
        System.out.println("Average Gpa :\t\t\t\t\t\t\t" + averageGpa);

    }
}
