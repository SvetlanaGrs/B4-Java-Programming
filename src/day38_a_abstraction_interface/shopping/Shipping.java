package day38_a_abstraction_interface.shopping;

public interface Shipping {
    //everything is public
    //by default variables - are public static final
    //CONSTANT variable
    String COUNTRY = "USA";

    //public abstract by default
    void shippingCost(boolean hasMembership);

}
