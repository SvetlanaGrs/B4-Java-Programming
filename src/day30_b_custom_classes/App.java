package day30_b_custom_classes;

//This is my blueprint class - where i will have set of instructions for object
public class App {

    //INSTANCE variables /FIELDS --- NOT METHOD
    String name;
    double version;
    boolean isFree;


    //Build some action/function for this class / for this Blueprint / template
    //INSTANCE METHOD / NON-STATIC method
    //Each object will run its own version
    //Since run method is INSTANCE method - we can not call by Class name
    public void run() {
        System.out.println(name + " is running....");
    }

    public void update() {
        System.out.println(name + " is updating...");
        version+=1;
    }
}
