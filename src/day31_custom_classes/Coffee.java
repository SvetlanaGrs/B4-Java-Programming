package day31_custom_classes;
//Template class
public class Coffee {

    //Instance variables - each object has its own copy of these
    double price;
    double sizeInOz;
    String brand;
    String type;

    public void drink (){
        System.out.println("Drinking " + type.toLowerCase() + " type of coffee");
    }

    public void refill (double addOz){
        System.out.println("Refilling "+ addOz + " oz");
        sizeInOz+=addOz;
    }

    public String toString() {
        return "Coffee: " +
                "\n\tprice: $" + price +
                "\n\tsize In Oz: " + sizeInOz +
                "\n\tbrand: " + brand  +
                "\n\ttype: " + type;
    }


}
