package day31_custom_classes;
//Template class
public class Car {
    //Instance variables - fields
    String model, color;
    int year;
    double fuelLevel;

    public String toString() {
        return "Car Info: " +
                "\n\tModel: " + model +
                "\n\tColor: " + color +
                "\n\tYear: " + year +
                "\n\tFuel Level: " + fuelLevel;
    }


    public void drive (){
        System.out.println("driving " + model);
        fuelLevel -= 5;
    }

    public void fillTank () {
        System.out.println("filling tank");
        fuelLevel = 100; // reassign to 100
    }


    public boolean isFuelLevelLow () {
        return fuelLevel < 25; // 100 < 25
    }


}

