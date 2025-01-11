package day38_a_abstraction_interface.shopping;

public class Runner {
    public static void main(String[] args) {
        /*
        Shopping s = new Shopping
        OnlineShopping os = new OnlineShopping
        can not create object of Abstract class. Can not be instantiated

        Shipping sh = new Shipping();
        also can not instantiated interface
         */

        Target t = new Target();
        t.buyItem();
        t.returnItem();
        System.out.println(t.price);
        System.out.println();
        System.out.println("---------------------");

        //Can i create object of Amazon class?
        Amazon a = new Amazon();
        System.out.println(a.COUNTRY); //not good practice to reach static member with object reference
        System.out.println(Amazon.COUNTRY);// good way
        a.deliveryEstimate();
        a.buyItem();
        a.returnItem();
        a.shippingCost(true);
        System.out.println(a.price);

        System.out.println("---------------------");
        System.out.println(Shipping.COUNTRY);
        System.out.println(Amazon.COUNTRY);
        System.out.println(OnlineShopping.COUNTRY);

    }
}
