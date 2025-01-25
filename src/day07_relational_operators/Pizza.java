package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        String pizzaType = "Pepperoni" ;
        int numOfSlices = 20 ;
        int numOfPeople = 6 ;
        int slicesForEachPerson = numOfSlices / numOfPeople;
        //int slicesLeftOver =  numOfSlices - (numOfPeople *slicesForEachPerson); ///Another way
        int slicesLeftOver =  numOfSlices % numOfPeople ;
        System.out.println(slicesLeftOver);
       String result = "We bought " + pizzaType + " pizza. It has " + numOfSlices + " slices. We are " + numOfPeople + " people and each of us will it " + slicesForEachPerson + " slices and there will " + slicesLeftOver + " slices left over." ;
        System.out.println(result);
    }
}
