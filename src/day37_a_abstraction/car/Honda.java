package day37_a_abstraction.car;
//CONCRETE class / NON-ABSTRACT class
public class Honda extends Car{
    @Override
    public void start(){
        System.out.println("Honda is starting by inserting key");
    }
}
