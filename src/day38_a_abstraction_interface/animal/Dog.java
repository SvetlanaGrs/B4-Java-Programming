package day38_a_abstraction_interface.animal;
//Concrete class / Non-abstract class
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dogs eat from bowl");
    }
}
