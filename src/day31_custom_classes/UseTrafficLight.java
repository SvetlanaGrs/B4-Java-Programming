package day31_custom_classes;

public class UseTrafficLight {
    public static void main(String[] args) {
        // Object Reference = Actual Object
        //                        constructor
       // TrafficLight obj1 = new TrafficLight();
       // System.out.println(obj1.color);

        //Initialize the instance variable color to be "Yellow"
       // obj1.color="Yellow";
       // System.out.println(obj1.color);

        //We initialized the instance variable called "color" to be set to yellow
        TrafficLight obj2 =new TrafficLight("yellow");
        System.out.println(obj2.color);

        TrafficLight obj3 = new TrafficLight("red");
        System.out.println(obj3.color);

        obj2.color="Green";
    }
}
