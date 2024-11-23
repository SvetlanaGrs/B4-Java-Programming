package day18_loops;

public class CharactersInString {
    public static void main(String[] args) {
        String word = "Svetlana";

        for (int i = 0; i < word.length(); i++) {
            int acsiiNumber= word.charAt(i);
            System.out.println(acsiiNumber);
//            System.out.println(0 + word.charAt(i)); // THE SAME
//            System.out.println((int)word.charAt(i));// THE SAME
        }
    }
}
