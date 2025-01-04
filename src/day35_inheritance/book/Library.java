package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        AudioBook ab1 = new AudioBook();
        ab1.duration=100;
        ab1.narrator="Morgan Freeman";
        ab1.title="Java is awesome";
        //ab1 object has access to 1 instance method - has access to its own class members and the parent object
        ab1.listen();
        //ab1.read();

        EBook eb1 = new EBook();
        //eb1 object has access to 9 instance variables
        eb1.size=10; //MB
        eb1.pages=600;
        eb1.title="Selenium";
        //eb1 object has access to 1 instance method
        eb1.read();
        //eb1.listen();

        Book b1 = new Book();
        //b1 object has access to 7 instance variables
        //b1.authorName ="Ab Jerry";
        //b1.narrator;
        //b1.pages;

        Author a1 = new Author("FEYRUZ JErry", 23);
        System.out.println(a1);

        Book b2 = new Book();
        System.out.println(b2.author);
        b2.author = new Author("Nadir SoftSkills", 30);
        System.out.println(b2.author);

        AudioBook ab3 = new AudioBook();
        ab3.author=new Author("Tom Fr", 40);
        System.out.println(ab3.author);

    }
}
