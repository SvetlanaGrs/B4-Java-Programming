package day38_a_abstraction_interface.shopping;
//Concrete class
public class Amazon extends OnlineShopping {//implements Shipping{
    @Override
    public void deliveryEstimate() {
        System.out.println("Amazon delivery estimate");
    }

    @Override
    public void buyItem() {
        System.out.println("Buy an amazon item");
    }

    @Override
    public void returnItem() {
        System.out.println("Return an amazon item");
    }

    @Override
    public void shippingCost(boolean hasMembership) {
        if(hasMembership=true){
            System.out.println("Has membership. Free shipping");
        }else{
            System.out.println("No membership.Shipping price $6.99");
        }
    }
}
