package day13_string;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String str = "Wednesday";

        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str); // return to us original one

        System.out.println("----------------------");
        System.out.println(str.toLowerCase());
        str = str.toUpperCase(); //here its REASSIGN
    }
}
