package day38_a_abstraction_interface.interface_methods;

//concrete class
public class MacbookPro implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Macbook Pro is turned on");
    }
}


class Runner{
    public static void main(String[] args) {

        //Reaching static members with interface
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
        //Reaching static members with class
        System.out.println(MacbookPro.NAME);
        System.out.println(MacbookPro.OS);

        //Reaching abstract method with Interface name - NOT VALID
        // Mac.turnOn();

        //
        // MacbookPro.turnOn();

        MacbookPro mac = new MacbookPro();
        mac.turnOn();

        System.out.println();
        //Reaching static member with interface name - Valid
        Mac.company();
        //Reaching the static member with class name
       // MacbookPro.company(); ONLY can be called with its OWN intercase name
       // mac.company(); ONLY can be called with its OWN intercase name

        System.out.println();
        //Reaching the default method with interface name - NOT VALID
        //Mac.faceTime();  // non-static can not be called by interface name

        //Reaching the default method with class name - NOT VALID
        //MacbookPro.faceTime();//non-static can not be called by interface name
        mac.faceTime();
    }
}