package day19_nested_loops;
/*
           Practice Task
                Implement this code with while loop
                    Hint: while loop condition - continue as long as there space
         */

import java.util.Scanner;

public class CamelCaseTODO {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter sentence: ");
        String str = key.nextLine().toLowerCase().trim();
        String camelCase = "" + str.charAt(0);
        char ch =1;

        while (str.charAt(ch-1)==' ') {
            camelCase += (""+ str.charAt(1)).toUpperCase();
            ch++;
            if (str.charAt(ch-1)!=' ');{
                camelCase += str.charAt(ch);
            }

        }

        camelCase = camelCase.replace(" ", "");
        System.out.println(camelCase);
    }
}
