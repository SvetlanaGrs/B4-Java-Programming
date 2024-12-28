package day32_custom_classes;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int pto;

    public Offer (String company, String location){
        this.company=company;
        this.location=location;

    }

    public Offer(String company, String location, double salary){
        this.company=company;
        this.location=location;
        this.salary=salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int pto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.pto = pto;
    }

    public String toString() {
        String result="Offer Info: ";
        result+="\n\tLocation: " + location;
        result+="\n\tCompany: "+ company;

        result+= "\n\tSalary: " + ((salary > 0) ?"$" +salary: "Info not available");
        result+="\n\tIs Full Time: " + ((isFullTime) ? "Full time" : "Not full time");
        result+="\n\tNumber of PTO: " + ((pto>1) ? pto: "Not pto days");


        return result;
    }
}
