package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String str1 = "Denver";
        //             012345
        char letter1 = str1.charAt(0);
        char letter2 = str1.charAt(1);
        char letter3 = str1.charAt(2);
        char letter4 = str1.charAt(3);
        char letter5 = str1.charAt(4);
        char letter6 = str1.charAt(5);

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);
       // System.out.println(str1.charAt(6));//.StringIndexOutOfBoundsException

        System.out.println();

        String str2 = "Chicago Fairfax NewYork Boston";
        String city1 = "Chicago";
        String city2 = "Fairfax";
        String city3 = "NewYork";
        String city4 = "Boston";

        //String [] cities; //This is just Array declaration

        //OPTION1 : Declare and assign value directly | 4 elements are added | size is 4
        String [] cities1 = {"Chicago", "Fairfax","NewYork","Boston"};

        //String [] citites11 = {city1,city2,city3,city4}; // we can also do it

        //OPTION2 : Declare array with size only. This shows it has 4 locations
        String [] cities2 = new String [4];


        //How do we access those elements
        System.out.println( cities1[0] );
        System.out.println( cities1[1] );
        System.out.println( cities1[2] );
        System.out.println( cities1[3] );
        //System.out.println( cities1[4] ); //.ArrayIndexOutOfBoundsException

        System.out.println();
        System.out.println( cities2[0]); // when we create an array just with the size but no values added< it shows that location is there by empty.
        System.out.println( cities2[1]); //null
        System.out.println( cities2[2]); //null
        System.out.println( cities2[3]); //null
        //System.out.println( cities2[4]);//.ArrayIndexOutOfBoundsException

        System.out.println();
        //How can i print all the elements
        System.out.println( cities1); // [Ljava.lang.String;@6acbcfc0--> We cant print directly. It will show some memory location/hashcode
        System.out.println(Arrays.toString( cities1 )); // Arrays class is used and it comes from java.util package---> .toString()

        System.out.println();
        //How can i remove square brackets

        String arrayToString = Arrays.toString( cities1); //"[Chicago, Fairfax, NewYork, Boston]"
        System.out.println(arrayToString);

        arrayToString = arrayToString.substring(1, arrayToString.length()-1);
        System.out.println(arrayToString);

        arrayToString=arrayToString.replace(",", "");
        System.out.println(arrayToString);

        System.out.println();
        //How do i get how many elements i have ---> size
        String [] cities3 = {"Chicago", "Fairfax","NewYork","Boston", "Chantilly", "Falls Church"};
        System.out.println( cities3.length );
    }
}
