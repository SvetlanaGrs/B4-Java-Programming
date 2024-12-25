package day31_custom_classes;

public class ThisKeyWord {
    //Instance variable - declared at Class level
    int a ;

    //local variable - declared at max method
    public ThisKeyWord(int a){

        //Java prioritizes LOCAL variables over the instance variables if they have same names
        this.a= a;

    }
}
