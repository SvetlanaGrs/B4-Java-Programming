package day19_nested_loops;
// today is -- > length = 8
// 01234567
// Repetitive action
//      - get the letter + check if one before is space
//                 if it space, get the current letter and make it uppercase and concate
//                 if it is not space, get the current one and concate as it is.
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter sentence: ");
        String str = key.nextLine().toLowerCase().trim();
        String camelCase = "" + str.charAt(0);
        //find the space + get the next one + make uppercase
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) ==' ') {
                camelCase += (""+ str.charAt(i)).toUpperCase();
            }else {
                camelCase += str.charAt(i);
            }
        }
        camelCase = camelCase.replace(" ", "");
        System.out.println(camelCase);
    }
}
/*
            TODO: Practice Task
                Implement this code with while loop
                    Hint: while loop condition - continue as long as there space
         */
