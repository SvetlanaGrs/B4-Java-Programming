package day31_custom_classes;
//Runner class - main method
public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffee1= new Coffee();


        //If we have toString method NOT declared - it will print memory location
        //If we have it declared, we can print the object and it will call toString byDefault
        System.out.println(coffee1);

        //You can do it this way-but not needed
        //System.out.println(coffee1.toString());

        //lets assign values to those instance variables
        coffee1.price=3.99;
        coffee1.sizeInOz=16.00;
        coffee1.brand="Starbucks";
        coffee1.type="Black";
        System.out.println(coffee1);

        //Call your custom instance method
        coffee1.drink();

        System.out.println();

        coffee1.refill(5);
        System.out.println(coffee1.sizeInOz);

//        System.out.println("--------------------------------");
//        Coffee coffee2 = new Coffee();
//        System.out.println(coffee2);
//
//        System.out.println();
//        coffee2.drink(); // Drinking null type of coffee
//
//        coffee2.refill(10);
//        System.out.println(coffee2);
    }
}
