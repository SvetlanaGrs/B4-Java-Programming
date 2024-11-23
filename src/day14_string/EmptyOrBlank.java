package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new word";

        System.out.println(str.isEmpty());

        str = " "; //reassign
        System.out.println(str.isEmpty()); //empty space - one character---> result is false, its not empty

        str = "";
        System.out.println(str.isEmpty()); // it is completely empty, no single character

        System.out.println(str.length() == 0 ? "There is not character": "There are some characters");

        System.out.println("---------------------------------");

        //str = "" // ONLY CASE which will be true for both
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Is blank: " + str.isBlank());

        System.out.println("---------------------------------");

        str = "Java is fun";
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Is blank: " + str.isBlank());

        System.out.println("---------------------------------");

        str = "          "; //ONLY BLANK SPACES
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Is blank: " + str.isBlank());

        boolean isEmpty = str.isEmpty(); // We can assign to boolean variable
        boolean isBlank = str.isBlank(); // We can assign to boolean variable
    }
}
