package day34_a_static;
//Runner class
public class CompLab {
    public static void main(String[] args) {
        Computer computer1= new Computer("Dell", "black", 999.90);
        System.out.println(computer1);
        Computer computer2= new Computer("HP", "silver", 599.90);
        System.out.println(computer2);

        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasScreen);

        computer1.price=299.99;
        System.out.println(computer1.price);
        System.out.println(computer2.price);

        computer1.hasScreen=true;
        System.out.println(computer1.hasScreen);
        System.out.println(computer2.hasScreen);
    }
}
