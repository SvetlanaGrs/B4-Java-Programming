package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand= "Apple"; // model = "Iphone16", color = "Matt Black"; //model, color
        String model= "Iphone 16";
        String color= "Matt Black";
        double price = 999.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A' ;

        System.out.println("I just bought Iphone 16 from Apple");
        System.out.println("I just bought " + model + " from " + brand);
        System.out.println("It is in the color of " + color + " and it has "+ storage + " GB");
        System.out.println("It has " +sim + "sim card and with the camera being" + hasCamera + " , the total price is " +price);

        System.out.println();
        System.out.println("I just bought " + model + " from " + brand + "\nIt has " +sim + "sim card and with the camera being" + hasCamera + " , the total price is " +price);

        System.out.println();
        String fullMessage = "I just bought " + model + " from " + brand + "\nIt has " +sim + "sim card and with the camera being" + hasCamera + " , the total price is " +price;

        System.out.println(fullMessage);

    }
}
