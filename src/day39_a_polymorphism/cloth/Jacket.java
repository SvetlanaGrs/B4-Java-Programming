package day39_a_polymorphism.cloth;
//Concrete class
public class Jacket extends Clothes implements HasHood{
    @Override
    public void wearClothes() {
        System.out.println("Wearing TShirt");
    }
    @Override
    public void putOnHood() {
        System.out.println("Put on Jacket's Hoody...");
    }
}
