package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualification {
    public static void main(String[] args) {
        boolean isCitizen, isResident;
        boolean hasDiploma;
        int age;
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to Army Station");
        System.out.println("Please answer the following question to check eligibility");
        System.out.print("\tAre you citizen(true/false): ");
        isCitizen = key.nextBoolean();
        System.out.print("\tAre you resident: ");
        isResident = key.nextBoolean();
        System.out.print("\tDo you have a high school diploma: ");
        hasDiploma = key.nextBoolean();
        System.out.print("\tHow old are you: ");
        age = key.nextInt();


        if ((isCitizen || isResident) && hasDiploma && (18 <= age && age <= 35)) {
            System.out.println("You are eligible");
        } else {
            System.out.println("\n\tYou are not eligible for the following reasons: ");
            if (!isCitizen || !isResident) {
                System.out.println("\t\tYou must be a citizen or a resident.");
            }
            if (!hasDiploma) {
                System.out.println("\t\tYou must have a high school diploma");
            }
            if (age < 18 || age > 35) { // or we can use this  (!(18 <= age && age <= 35))
                System.out.println("\t\tYour age must be between 18 to 35 years old");
            }

//            System.out.println();
//            System.out.println(isCitizen);
//            System.out.println(hasDiploma);
//            System.out.println(isResident);
//            System.out.println(age);
        }
    }
}


//armyEligible = (isResident || isCitizen) && hasDiploma && (age >= 18 && age <= 35);
//        String output = !(isResident || isCitizen)? "You dont meet citizen/resident criteria for eligibility" : !hasDiploma?
//                "You dont meet diploma criteria for eligibility" : (age >= 18 && age <= 35)? "You dont meet age(18-35) criteria for eligibility" :
//                "Congratz, you are eligible";
//
//        System.out.println("armyEligible = " + armyEligible);
//        System.out.println(output);