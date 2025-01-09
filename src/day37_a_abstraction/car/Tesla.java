package day37_a_abstraction.car;
//CONCRETE class / NON-ABSTRACT class
public class Tesla extends ElectricCar{

    public void start(){
        System.out.println("Tesla is starting by card");
    }

    @Override
    public void charge() {
        System.out.println("TEsla is charging");
    }
}
