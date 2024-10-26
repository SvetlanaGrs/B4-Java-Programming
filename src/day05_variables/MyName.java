package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'S';
        char letter2 = 'v';
        char letter3 = 'e';
        char letter4 = 't';
        char letter5 = 'l';
        char letter6 = 'a';
        char letter7 = 'n';
        char letter8 = 'a';
        //CONCATENATION
        System.out.println(letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);
        System.out.println("letter6 = " + letter6);
        System.out.println("letter7 = " + letter7);
        System.out.println("letter8 = " + letter8);

        System.out.println();
        //Addition
        System.out.println(letter1+letter2+letter3+letter4+letter5+letter6+letter7+letter8);

        String myName = "" + letter1+letter2+letter3+letter4+letter5+letter6+letter7+letter8;
        System.out.println(myName);


    }
}
