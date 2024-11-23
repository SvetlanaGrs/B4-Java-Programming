package day15_string;

import com.sun.security.jgss.GSSUtil;

public class CharMethod {
    public static void main(String[] args) {
        //Num of chars     1234
        String str =      "loop";
        // INDEXs (location) start from 0
        // In String every single char or charter has an INDEX

        System.out.println("Num of characters " + str.length());
        //First character in str ---
        System.out.println(str.charAt(0));
//       String firstCharInStr = str.charAt(0); // WE CANNOT DO IT
        //We can do it by these ways:
       String firstCharInStr = "" +  str.charAt(0);
       char firstCharInStr2 = str.charAt(0);

        //First character in str ?
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));


        //System.out.println(str.charAt(4)); we cannot run it, error. index 4 out of bounds for length 4

        System.out.println();
        //Last character in str ?
        String str2 = "dfcfvgbhifjekfmkdnfknghsjnfksdflksf;lwqprejwekfnsdasdfgh";
        //1 Option

        System.out.println(str2.length());
        System.out.println(str2.charAt(49));

        //2 Option
        System.out.println(str2.length() - 1);
        System.out.println(str2.charAt( str2.length() - 1)); //Its more comfortable to read


        //2 last character:
        System.out.println(str2.charAt( str2.length() - 2) );

        System.out.println();
        System.out.println("Number of characters in str2: " + str2.length());
        System.out.println("First character in str2: " + str2.charAt(0));
        System.out.println("Last character in str2: " + str2.charAt( str2.length() - 1));

        System.out.println();
        String str3 = "loop - camp";


    }
}
