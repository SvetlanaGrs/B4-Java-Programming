package day37_a_abstraction.language;

public class Turkish implements Language {
    @Override
    public void sayHello() {
        System.out.println("Merchaba");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Hoscakal");
    }
}
