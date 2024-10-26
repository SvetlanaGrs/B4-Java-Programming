package day04_variables;

public class Fruits {
    public static void main (String[] args){
        // Have a 3 containers and each container will have "x number" of apples, grapes and bananas - int data type
        // Have a 3 containers and each container will have "x price worth" of apples, grapes and bananas - double data type
        int apples = 70;
        int grapes = 80;
        int bananas = 100;

        //println statement
        //""---> value which is String
        //+ ----> CONCATENATION / plus (math)
        //60 ---> value which is whole number ( by default is is int)
        System.out.println("This is how many apples i have: " + 60); // The value 60 ----> HARDCODED

        System.out.println("This is how many apples i have: " + apples); // The apples is variable ----> DYNAMICALLY

        System.out.println(grapes);                // grape.sout
        System.out.println("Grapes = " + grapes);  // grape.soutv ----> DYNAMICALLY
        System.out.println("Bananas = " + bananas);


        System.out.println("----------------------------");
        //REASSIGNMENT
        //I sold 30 apples
        System.out.println("I sold 30 apples");
        apples = 40; //Reassign a varidbled called apples to the new value which is 40
        System.out.println("This is how many apples i have after the sale: " + apples);

        System.out.println("----------------------------");

        double price = 16.99;
        //""- String
        //+- Concatenation
        //"" String
        System.out.println("The discounted price for all the left over apples is $ "+ "15.99"); // "15.99"---- HARDCODED
        System.out.println("The discounted price for all the left over apples is $ "+ price); // price ----DYNAMIC

        System.out.println("----------------------------");

        //CONCATENATION vs plus (math)
        System.out.println(50+50);    // plus (math)----->100
        System.out.println("50"+ 50); // CONCATENATION ---->5050

        System.out.println(10 + 10 + "10" + 10 + 10);
        // int+int+string+int+int
        //   int + String +int +int ---> 20+ "10" + 10 + 10
        //          String+int +int ---> "2010" +10 +10
        //           String +int ------> "201010"+10
        //           String  ------> "20101010"

        System.out.println("10" + 10 + "10" + 10 + 10);
        //AFter first string everything becomes string -----EVERUTHING is a CONCATENATION

    }
}
