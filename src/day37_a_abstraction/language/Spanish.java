package day37_a_abstraction.language;

import day37_a_abstraction.book.Create;

public class Spanish implements Language  {
    @Override
    public void sayHello() {
        System.out.println("Hola");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Adios");
    }
}
