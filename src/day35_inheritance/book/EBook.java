package day35_inheritance.book;
//Template class - Blueprint for object
public class EBook extends Book {
    //Instance variables
//    String author;
//    int authorAge;
//    String genre;
//    String title;
//    int chapterCount;
//    double price;
//    boolean hasMovie;

    double size;
    int pages;

    //Instance method
    public void read(){
        System.out.println("Reading " + title + " which is  " + pages + " pages");
    }
}
