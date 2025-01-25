package day33_a_static;

import day30_b_custom_classes.App;

public class Iphone {

    //Instance variables
    String model;
    double price;

    //Static variables
    static String company;
    static String os;
    static String appleDay;

    //Constructor - helps to initialize instance variables

    public Iphone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    //Static block - static initialization
    static {
        System.out.println("Static Block Run");
        //model="..." NOT VALID
        company="Apple";
        os = "IOS";
        appleDay="November 30th";



    }
    //Instance method - special one
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}' +
                " -- " +
                "\n\tCompany: " + company+
                "\n\tOS: " + os +
                "\n\tApple day: " + appleDay;
    }
}
