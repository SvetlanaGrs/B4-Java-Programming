package day24_methods;

public class LastCharacters {
    public static void main(String[] args) {
        String [] [] str = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };
        String last ="";
        for (String [] eachArr:str) {
            last = "";
            for(String eachWord:eachArr) {
                last+=eachWord.substring(eachWord.length()-1);
            }
            System.out.println(last);
        }
    }
    /*
            TODO: Practice
                Implement the same code with traditional loop: fori
         */

}
