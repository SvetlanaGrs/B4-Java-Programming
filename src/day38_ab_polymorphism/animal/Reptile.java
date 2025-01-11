package day38_ab_polymorphism.animal;

public class Reptile extends Animal {

    //String name;
    int numOfLegs;

    @Override
    public void eat() {
        System.out.println("Reptile eating....");
    }
}
