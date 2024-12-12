package my_utilities;

public class StringUtil {
public static String reverse (String str){
    String reversed = "";
    for (int i = str.length()-1; i >= 0 ; i--) {
        reversed += str.charAt(i);// reversed ="" + p; | reversed = "p" + m | reversed = "pm" + a
    }
    return reversed;
}


    public static String fixFormat (String input){

        String result = "";

        result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;
    }



    public static int frequencyOfLetters (String str, char letter){   // ("apple", 'p')
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }

    /**
     * This method finds the character which are in the String more thant once.
     * @param str is the given String
     * @returns the letter which occurs more than once
     */
    public static String duplicateCharacters (String str) {

        String unique = "";
        String duplicates = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachLetterLoop1 = str.charAt(i);

            if (unique.contains(eachLetterLoop1 + "")) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char eachLetterLoop2 = str.charAt(j);
                if (eachLetterLoop1 == eachLetterLoop2) {
                    count++;
                }
            }

            if (count > 1) {
                duplicates += eachLetterLoop1;
            }

            if (!unique.contains(eachLetterLoop1 + "")) {
                unique += eachLetterLoop1;
            }
        }
        return duplicates;
    }

    public static String uniqueCharacters (String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if  (StringUtil.frequencyOfLetters(str, each)==1) {
                unique+=each;
            }
        }

        return unique;
    }
}
