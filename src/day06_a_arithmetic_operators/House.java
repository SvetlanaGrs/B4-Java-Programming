package day06_a_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        String houseType = "Townhouse";
        int numberOfBedrooms = 3;
        int numberOBathrooms = 2;
        int numberOfKitchens = 1;
        //We can declare and initialize dame datatype in ONE statement
        //int numberOfBedrooms = 3, int numberOBathrooms = 2, int numberOfKitchens = 1;
        boolean isThereAbasement = false;
        boolean isThereAnAttic = true;
        boolean isThereApool = true;
        boolean isTheHouseForSale = false;
        int costOfTheHouse = 456_000;
        String address = "5049 Capital Boolevard" ;
        int zipcode = 305483;
        boolean isAParkNearBy = true;
        short ratingOfSurroundingSchoolDistrict = 5;
        System.out.println("House type is: " + houseType);
        System.out.println("Number of bedrooms is: " + numberOfBedrooms);
        System.out.println("Number of Bathrooms is: " + numberOBathrooms);
        System.out.println("Number of kitchens: " + numberOfKitchens);
        System.out.println("Is there a basement: " + isThereAbasement);
        System.out.println("Is there an attic: " + isThereAnAttic);
        System.out.println("Is there a pool: " + isThereApool);
        System.out.println("Is the house for sale: " + isTheHouseForSale);
        System.out.println("Cost of the house: " + costOfTheHouse);
        System.out.println("Adress: " + address);
        System.out.println("Zipcode: " + zipcode);
        System.out.println("Is a park near by: " + isAParkNearBy);
        System.out.println("Rating of surrounding school distric: " + ratingOfSurroundingSchoolDistrict);

        String result = "I am looking for \"" + houseType+ "\" which is located in " + address + " " + zipcode + ". It has " +numberOfBedrooms + " bedroom and " + numberOfKitchens + " kitchen as well as " + numberOBathrooms + " bathroom. The cost of the house is " + costOfTheHouse +"." + "\nThe house has the following additional info:\n" + "\tSchool Ratings:\t\t" + ratingOfSurroundingSchoolDistrict + "\n\tHas Basement:\t\t" + isThereAbasement + "\n\tHas Attic:\t\t\t" + isThereAnAttic + "\n\tHas Pool:\t\t\t" + isThereApool + "\n\tIs For Sale:\t\t" + isTheHouseForSale + "\n\tHas nearby Park:\t" + isAParkNearBy;
        System.out.println(result);
    }
}
