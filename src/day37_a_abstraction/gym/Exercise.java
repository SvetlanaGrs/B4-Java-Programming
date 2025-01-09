package day37_a_abstraction.gym;

public abstract class Exercise {

    String name;
    public Exercise(String name){
        this.name=name;
    }

    //ABSTRACT method - method with no implementation, without body
    public abstract void doExercise();

    public abstract void burnCalories(int minutes);

    public abstract int calculateCaloriesBurned (int minutes);
}
