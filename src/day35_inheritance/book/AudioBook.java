package day35_inheritance.book;
//Template class - Blueprint for object
public class AudioBook extends Book {
    //Instance variables
//    String author;
//    int authorAge;
//    String genre;
//    String title;
//    int chapterCount;
//    double price;
//    boolean hasMovie;

    double duration;
    String narrator;

    //Instance method
    public void listen(){
        System.out.println("Listening to " + title + " by " + narrator);
    }

}
