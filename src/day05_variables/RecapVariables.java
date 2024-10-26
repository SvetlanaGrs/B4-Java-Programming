package day05_variables;

public class RecapVariables {
    public static void main (String[] args){
        //Declare some variables [LOCAL VARIABLES]
        byte numOfTeaCup ;
        double totalPrice;
        int numOfTotalStudents;

        // Since we have not value - we cannot use them
        // System.out.println(numOfTeaCup);

        //Assigning or initializing the variables
        numOfTeaCup = 4;
        totalPrice = 20.0;
        numOfTotalStudents = 30;

        System.out.println(numOfTeaCup);
        System.out.println(totalPrice);
        System.out.println(numOfTotalStudents);

        System.out.println(numOfTeaCup * numOfTotalStudents);  //4*30=120
        System.out.println(numOfTeaCup +" * " + numOfTotalStudents); // 4*30 -----Int +String+int-----concatenation


        // Declare and Assign in ONE statement together
        double temperature  = 67.7;
        int day = 4;
        System.out.println("Today is "  +4 + "th day of the week");   //Hardcoded
        System.out.println("Today is " + day + "th day of the week"); //Dynamic code

        System.out.println("Today the weather was " + temperature + " degree");
        System.out.println("--------------------------");

        int i1, i2, i3; //we can declare in one line
        i1 = 1;
        i2 = 2;
        i3 = 3;

        int num; String word; // we can assign like this




    }
}
