package day37_a_abstraction.language;

public interface Language {
    //public static final by default
    String PLANET = "EARTH";

    //Public abstract methods by default
    void sayHello();
    void sayGoodbye();

    //default method
    public default void sayBye(){

    }

    //static method
    public static void sayHelloStatic(){
// static method - since we have static variable, it is possible to have a static method using that static variable
    }

}
