package day32_custom_classes;
//Template class
public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;

    //Constructor name and jobTitle
    public Employee(String name, String jobTitle) {
        this.name=name;
        this.jobTitle=jobTitle;
    }

    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void goToMeeting(){
        System.out.println(name+" is going to the meeting");
    }

    public String toString() {
        return "Employee: " +
                "\n\tname: " + name +
                "\n\tid: " + id +
                "\n\tjobTitle: " + jobTitle  +
                "\n\tsalary: " + salary ;
    }
}
