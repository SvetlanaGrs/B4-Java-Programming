package day19_nested_loops;

//INTERVIEW QUESTION

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "apple";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
           char outterLetter = str.charAt(i);               //a

         if (unique.contains("" + outterLetter)) {
         continue;
         }

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);           //a - p - p - l - e
                if (outterLetter==innerLetter) {
                    count++;
                }
            }
            System.out.println(outterLetter + " - " + count);
            unique += outterLetter;
        }
    }
}
