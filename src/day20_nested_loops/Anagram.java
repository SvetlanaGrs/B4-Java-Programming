package day20_nested_loops;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent"; //word2.replaceFirst("l" , "" ) ---> sient-->sent--->ent--->en-->n-->

        if (word1.length()!=word2.length()) {
            System.out.println("Not Anagram");
        } else {
            //Take each char from the first string (word1)
            //     remove that char from the second string (word2)
            //
            for (int i = 0; i < word1.length(); i++) {
                char eachChar = word1.charAt(i);
               word2 = word2.replaceFirst("" + eachChar , "" ) ;
            }
            if (word2.isEmpty()) {
                System.out.println("It is anagram");
            }else {
                System.out.println("It is not anagram");
            }
        }
    }
}