package day07_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {

        int ageOfPerson = 65;
        boolean isKid = ageOfPerson <= 13;
        System.out.println("The person is Kid: " + isKid);
        boolean isSenior = ageOfPerson >= 65;
        System.out.println("The person is Senior: " + isSenior);
    }
}
