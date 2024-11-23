package day16_loops;

public class ReplaceMethod {
    public static void main(String[] args) {
        String str = "java is a coding language";

        System.out.println("Before .replace" + str);
        str = str.replace('a','e');
        System.out.println("After .replace: " + str);

        str = str.replace("e" , "u");
        System.out.println("After .replace: " + str);

        System.out.println();
        String sentence = "Today is Wednesday. Wednesday is fun day because on Wed. we have Java ";
        sentence = sentence.replace("Wednesday", "Thursday"); //EXACT MATCH
        System.out.println(sentence);
        sentence = sentence.replace("wednesday", "Thursday"); //EXACT MATCH
        System.out.println(sentence);

        String sentence2 = "Today is Wednesday and we have Java class. Today we will do more practice.";
        System.out.println(sentence2);
        sentence2 = sentence2.replaceFirst("Today" , "Tomorrow");
        System.out.println(sentence2);
        sentence2 = sentence2.replaceFirst("Wednesday", "Thursday");
        System.out.println(sentence2);
    }
}
