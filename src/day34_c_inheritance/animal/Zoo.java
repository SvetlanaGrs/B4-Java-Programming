package day34_c_inheritance.animal;
//Runner class
public class Zoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.type="Husky";
        dog1.numOfLegs=4;
        dog1.walk();
        dog1.bark();
       // dog1.meow()  in DOG CLASS WE DONT HAVE THIS METHOD
        dog1.age=30;

        Cat cat1 = new Cat();
        cat1.type="Persian";
        cat1.numOfLegs=4;
        cat1.walk();
        cat1.meow();
        //cat1.bark(); //NO METHOD in CAT class
        cat1.age=40;


        Animal animal1 = new Animal();
        animal1.type="General Animal";
        animal1.numOfLegs = 4;
        animal1.walk();
    }
}
