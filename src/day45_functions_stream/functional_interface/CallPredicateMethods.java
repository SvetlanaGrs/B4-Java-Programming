package day45_functions_stream.functional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {
        boolean result = UsePredicate.isPalindrome.test("anna");
        System.out.println(result);

        System.out.println(UsePredicate.isPalindrome.test("racecar"));

        System.out.println("--------------");
        System.out.println(UsePredicate.isPrime.test(5));
    }
}
