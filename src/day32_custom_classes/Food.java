package day32_custom_classes;

public class Food {
    //Instance variables
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    //1 Constructor
    public Food (String name){
        this.name=name;
    }
    //2
    public Food(String name, int quantity){
        this(name);
        //this.name=name;
        this.quantity=quantity;
    }
    //3
    public Food (String name, int quantity,double unitPrice ){
//        this.name=name;
//        this.quantity=quantity;
        this(name,quantity);
        this.unitPrice=unitPrice;
        calculateTotalPrice();
    }

    public void calculateTotalPrice(){
        totalPrice=quantity*unitPrice;
    }

    public String toString() {
        return "Food Info: " +
                "\n\tname= " + name  +
                "\n\tquantity= " + quantity +
                "\n\tunitPrice= " + unitPrice +
                "\n\ttotalPrice= "  + totalPrice ;
    }
}
