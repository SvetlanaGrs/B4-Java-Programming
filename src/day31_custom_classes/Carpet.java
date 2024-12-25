package day31_custom_classes;
//Template class - set of instructions for the objiect of this class
public class Carpet {
    //Instance variables
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;

    //Create constructor that initialize these instance variables
    public Carpet(double inputWidth, double inputLength, double inputUnitPrice,boolean inputIsPersian){
        width=inputWidth;
        length=inputLength;
        unitPrice=inputUnitPrice;
        isPersian=inputIsPersian;
        calculateTotalPrice();
    }

    public void calculateTotalPrice (){
        totalPrice=width*length*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }
    }

    public String toString() {
        return "Carpet Info: " +
                "\n\twidth: " + width +
                "\n\tlength: " + length +
                "\n\tunitPrice: $" + unitPrice +
                "\n\ttotalPrice: $" + totalPrice +
                "\n\tisPersian: " + isPersian;
    }
}
