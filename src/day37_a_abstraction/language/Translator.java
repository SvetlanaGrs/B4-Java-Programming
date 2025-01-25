package day37_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {
       // Language obj = new Language() ;
        //Can not create object of interface. Same as abstract class

        Spanish s = new Spanish();
        s.sayHello();
        s.sayGoodbye();
        System.out.println(Spanish.PLANET);

        Turkish t = new Turkish();
        t.sayGoodbye();
        t.sayHello();
        System.out.println(Turkish.PLANET);

    }
}
