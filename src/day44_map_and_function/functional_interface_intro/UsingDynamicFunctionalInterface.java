package day44_map_and_function.functional_interface_intro;

public class UsingDynamicFunctionalInterface {
    public static void main(String[] args) {
        DynamicFunctionalInterface <String> printChars =(str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };

        DynamicFunctionalInterface <Integer> printNum5Times =(num)->{
            for (int i = 0; i < 5; i++) {
                System.out.println(num);
            }
        };

        printChars.test("Hello");
        printNum5Times.test(10);
    }
}
