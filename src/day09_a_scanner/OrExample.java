package day09_a_scanner;

public class OrExample {
    public static void main(String[] args) {
        int apple = 5;
        int oranges = 7;

        System.out.println(apple > 3 || oranges < 5);
        // I dont care what the 1st expression (left side), i want execute second part---->|
        System.out.println(apple > 3 | oranges < 5);

    }
}
