package day31_custom_classes;

public class TrafficLight {

    //Rule1
    //If in the class we do not have any EXPLICITLY declared constructor, there us DEFAULT constructor there
    //Default constructor does not have any parameters and is not declared
    //It is hidden
    //public className(){}


    //Rule 2
    //Once you declared constractor explicitly, the compiler does NOT create a DEFAULT constructor
//    public TrafficLight(){
//
//    }

    //Instance value
    String color;

    //Declared a constructor
    public TrafficLight(String color1){
        color=color1;
   }

}
