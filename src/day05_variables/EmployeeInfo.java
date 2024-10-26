package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle;
        int age, numOfPTO;
        char gender, suite; //M,F
        boolean isFullTime, isMarried;
        double salary;

        firstName = "Tom";
        lastName = "Jerry";
        //or you can do this String firstName=Tom, lastName= Jerry
        jobTitle = "SDET";
        age = 30;
        numOfPTO = 21;
        salary = 120_000.00; // 120,000.00 - instead of common you can use underscore
        isFullTime = true;
        isMarried = false;
        gender = 'M';
        suite = 'A';
        companyName = "Loopcamp";

        String fullReport = "Full Report:\n\tFirst name:\t\t"+firstName +"\n\tLast name:\t\t"+lastName+ "\n\tCompany name:\t"+ companyName+ "\n\tAge\t\t\t\t" + age + "\n\tPTO ammount:\t"+ numOfPTO + "\n\tSalary: \t\t$" + salary +"\n\tIs Full Time?\t"+ isFullTime + "\n\tIs married?\t\t"+ isMarried + "\n\tGender:\t\t\t"+ gender+ "\n\tSuite:\t\t\t"+ suite;
        System.out.println(fullReport);
        System.out.println();
        System.out.println(fullReport);

    }
}
