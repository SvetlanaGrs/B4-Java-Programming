package day34_c_inheritance.animal;

public class Animal {
    //Animal is the parent class which inherits all accessible members to Child classes
    //Instance variables
    String type;
    int numOfLegs;
    int age;

    //Instance method
    public void walk(){
        System.out.println(type+ " is walking");
    }
}
