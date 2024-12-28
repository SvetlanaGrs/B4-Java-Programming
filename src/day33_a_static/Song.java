package day33_a_static;

public class Song {
    //Instance variables - each object has its own set of copies - no static
    String name;
    double length;
    String singer;
    String genre;

    //Constructor - special method , No return, used to initialize variables
    //1st constructor
    public Song (String name){
        //name=name; Here compiler prioritizes the LOCAL over INSTANCE since both has same name
        this.name=name;
    }

    //2nd constructor
    public Song (String name, double length){
        //this.name=name;
        this(name);
        this.length=length;
    }

    //3rd constructor
    public Song(String name, double length, String singer, String genre) {
        //this.name = name;
        //this.length = length;
        this(name,length);
        this.singer = singer;
        this.genre = genre;
    }


    //If this toString() method is not declared explicitly, printing the object will give a memory location
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
