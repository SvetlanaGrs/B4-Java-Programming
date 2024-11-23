package day13_string;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "loop";
        System.out.println(str1);

        str1 = str1.toUpperCase(); // It makes a copy of original one, not change at original ----IMMUTABLE
        System.out.println(str1);

        str1 = str1 + "camp";
        System.out.println(str1);

        //ALSO it works with new String()
        // Its actually made a new one, copy of original one. We are not changing original one
    }
}
