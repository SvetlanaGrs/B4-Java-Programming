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
        int ch =1;

        while (ch<str.length()) {
            if(str.charAt(ch-1)==' ') {
                camelCase += (""+ str.charAt(ch)).toUpperCase();
            }else {
                camelCase += str.charAt(ch);
            }
            ch++;

        }

        camelCase = camelCase.replace(" ", "");
        System.out.println(camelCase);
    }
}
