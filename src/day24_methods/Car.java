package day24_methods;

public class Car {

    //public, static , void(no return, only do action), non-param. method
    public static void unlockCar() {
        System.out.println("Unlocking the car.");
    }

    public static void openDoor() {
        System.out.println("Opening the door");
    }

    public static void getInCar () {
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReady () {
        System.out.println("Put the seatbelt on");
        System.out.println("Check the mirrors");
        System.out.println("Turn the music on");
        System.out.println("Lower the windows");
        System.out.println("Put on navigation");
    }

    public static void startCar () {
        System.out.println("Start engine");
    }

    public static void drive () {
        System.out.println("Switch the gear into D");
        System.out.println("Drive and go");
    }

    public static void driveInRush () {
        unlockCar();
        getInCar();
        startCar();
        drive();
    }

    public static void main(String[] args) {
        unlockCar();
        openDoor();
        getInCar();
        getReady();
        startCar();
        drive();

        System.out.println("------------");

        driveInRush();
    }
}
