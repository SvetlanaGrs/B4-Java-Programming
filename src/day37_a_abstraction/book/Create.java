package day37_a_abstraction.book;

//interface is another way of achieving ABSTRACTION
public interface Create {

    //variables -> by default it is public static and final -CONSTANT has to be initialized
    // public static final String NAME = "Java"; /same is above, but dont need to declare 'public static final'
     String NAME = "Java";

     // methods with 'return' type and name and ()  - by default it is 'public abstract'
  //  public abstract void read();/same is above, but dont need to declare 'public abstract'
     void read();

     void write();



}
