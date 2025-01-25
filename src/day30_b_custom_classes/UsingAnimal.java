package day30_b_custom_classes;

//Runner class
public class UsingAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println(animal1.population);
        System.out.println(animal1.species);

        System.out.println();
        System.out.println(new Animal().population); //created completely new object
        System.out.println(new Animal().species);

    }
}
