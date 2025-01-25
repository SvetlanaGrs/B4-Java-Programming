package day34_a_static;
//template class
public class Computer {
    //Instance variables - each objects has its own copy
    String brand;
    String color;
    double price;

    //Static variables - each objects shares the same copy
   static boolean hasScreen;
   static boolean hasBattery;
   static boolean hasMemory;

   //initializer for static variables
    static {
       System.out.println("Running static block");
        hasScreen = false;
        hasBattery=true;
        hasMemory=true;
        //price=34.99; NOT VALID. STATIC ACCEPTS ONLY STATIC
   }

   //Initializer for instance variables - constructor
    public Computer(String brand, String color, double price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasScreen=" + hasScreen +
                ", hasBattery=" + hasBattery +
                ", hasMemory=" + hasMemory +
                '}';
    }
}
