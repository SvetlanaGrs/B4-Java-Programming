package day39_a_polymorphism.book;

public class JavaTestBook  extends EBook{
    //You can have any other members specific to this class: instance members, static members, constr
    boolean isFun;

    @Override
    public void open() {
        System.out.println("Openning Java text book...");
    }

    @Override
    public void read() {
        System.out.println("Reading Java text book...");
    }

    @Override
    public void download() {
        System.out.println("Downloading Java text book...");
    }
}
