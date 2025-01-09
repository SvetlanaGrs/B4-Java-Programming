package day37_a_abstraction.gym;

import java.lang.reflect.Executable;

public class Gym {
    public static void main(String[] args) {
        //Can not create an object of abstract class
        //Exercise obj = new Exercise()

        Running obj1 = new Running("Marathon");
        obj1.doExercise();
        obj1.burnCalories(1000);
        System.out.println(obj1.name);
        System.out.println(obj1.calculateCaloriesBurned(10));

        System.out.println();

        PullUps obj2 = new PullUps("Kneew to elbow");
        obj2.doExercise();
        obj2.burnCalories(20);
        System.out.println(obj2.name);
        System.out.println(obj2.calculateCaloriesBurned(10));

    }
}
