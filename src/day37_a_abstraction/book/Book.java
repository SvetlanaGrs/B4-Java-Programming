package day37_a_abstraction.book;
//CONCRETE class
public class Book implements Create {
    @Override
    public void read() {
        System.out.println("Reading book");
    }

    @Override
    public void write() {
        System.out.println("Writing book");
    }
}
