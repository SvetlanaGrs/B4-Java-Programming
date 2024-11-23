package day09_b_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {

        //Single If statement
        if (false) {
            System.out.println("1st Print Statement");

        }
        //Println  statement
        System.out.println("2nd Print Statement");

        //Single If statement
        if (true) {
            System.out.println("3rd Print Statement");
        }
        int score = 75;
        if (score >= 75) {
            System.out.println("You pass exam");
        }
        if (score < 75) {
            System.out.println("You fail the exam");
        }

        //Single If statement with logical operators wchich result is boolean
        System.out.println("-------------------");

        int year = 2028; //2019, 2020, 2021
        boolean isCovidQuarantineYear = year == 2019 || year ==2020 || year == 2021;
      // OR  boolean isCovidQuarantineYear = year >= 2019 && year <=2021; // There is not one solution - implementation of the code be different but the result the same
        if (isCovidQuarantineYear) {
            System.out.println(year + " was a COVID quarantine year");
        }
        if (!isCovidQuarantineYear) {
            System.out.println("It is not a COVID year. Go out and enjoy");
        }
        if (isCovidQuarantineYear == false) {
            System.out.println("It is not a COVID year. Go out and enjoy");
        }

    }
}
