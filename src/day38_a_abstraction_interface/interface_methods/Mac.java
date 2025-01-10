package day38_a_abstraction_interface.interface_methods;

public interface Mac {
    //everything in interface is 'public'
    //all the variables are 'public static final'
    //all the methods without body ->'public abstract'
    //there is no constructor at all( including default)
    //can not have any blocks -> static
    //possible to have 'default' and 'static' method

    //we can have total 4 in interface
    //1 - public static  final variables / CONSTANCE
    String NAME = "Apple";
    String OS = "IoS";

    //2 - public abstract methods
    void turnOn();

    //3 - public  static method - only belong to this interface
    static void company(){
        System.out.println("Company name: " + NAME);
        System.out.println("Operating system: " + OS);
    }

    //4 - default method | default is not the access modifier in interface
    default void faceTime(){
        System.out.println("Calling with Facetime");
    }
}
