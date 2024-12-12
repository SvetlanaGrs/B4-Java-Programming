package day25_methods;

import my_utilities.StringUtil;

public class FrequencyOfChars {
    // void vs return ----------- > return ---- > int
    // param vs non-param ------- > param ----- > (String str, char letter);
    public static int frequencyOfLetters (String str, char letter){   // ("apple", 'p')
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }



    public static int frequencyOfLetters2 (String str, char letter){   // ("apple", 'p')
        int count = 0;

        //char [] arr =  str.toCharArray();
        for (char each : str.toCharArray()) {
            if (each == letter){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int num1 = frequencyOfLetters("apple", 'p');
        System.out.println(num1);
        System.out.println(  frequencyOfLetters2("apple", 'p')  );
    }

}
