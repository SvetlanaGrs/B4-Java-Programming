package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {
        int currentSpeed = 27 ;
        int speedLimit = 25;
        //You can go a little higher --> 5
        boolean isSpeeding = currentSpeed >= speedLimit + 5  ;
        System.out.println("Are you speeding?: " + isSpeeding);
        System.out.println("Speeding limit in law: " + speedLimit);



    }
}
