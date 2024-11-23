package day18_loops;

public class CountType {
    public static void main(String[] args) {

        // find how many hi is in the word
        String word = "aaaahisvsvsvhisvsvsvhisfmm";
        int count = 0;

        for (int i = 0; i < word.length()-1; i++) {

           // word.charAt(0)=='h' && word.charAt(i+1)=="i"
           // word.charAt(23)=='h' && word.charAt(24)=="i" but 24 is not exist ---> length -1
           if ( word.charAt(i)=='h' && word.charAt(i+1) == 'i') {
               count++;
           }

        }
        System.out.println("You got " + count + " times \"hi\" in the " + word);

    }
    //TODO: Try to do this code with the substring method
}
