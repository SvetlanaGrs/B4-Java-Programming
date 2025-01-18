package day42_b_maps.classroom;
//Template class - how each object of this class will behave
public class Student {
    String name;
    int age;
    String ID;

    //Custom constructor eliminates default constructor
    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student Info :" +
                "\n\tname=" + name +
                "\n\tage=" + age +
                "\n\tID=" + ID;
    }
}
