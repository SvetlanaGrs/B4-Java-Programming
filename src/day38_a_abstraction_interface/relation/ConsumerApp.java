package day38_a_abstraction_interface.relation;

import day38_a_abstraction_interface.shopping.Shipping;

//Going from interface to Interface is still inheritance - we use 'extends'
//Interface can extend multiple interfaces
public interface ConsumerApp extends AllowUserToSell , Shipping {

}

//Going from interface to class( is the one get additional info from interface)
abstract class Test implements AllowUserToSell,Shipping{

}

class Runner{
    public static void main(String[] args) {

    }
}
