package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Tom", "SDET");
        System.out.println(emp1);

       emp1.goToMeeting();
    }
}
