package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean isTriangle, isCircle;
        System.out.println("Enter 3 angles (in decimals): " );
       // key.nextDouble(); //taking info from user
       double angle1 = key.nextDouble(); //taking info from user and assigning into container/variable into angle 1
       double angle2 = key.nextDouble();
       double angle3 = key.nextDouble();
       isTriangle = (angle1 + angle2 + angle3) == 180;
       isCircle = (angle1 + angle2 + angle3) == 360;
        System.out.println("Is it triangle: " + isTriangle);
        System.out.println("Is it circle: " + isCircle);
    }
}
