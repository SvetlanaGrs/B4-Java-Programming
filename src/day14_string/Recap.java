package day14_string;

public class Recap {
    public static void main(String[] args) {
        String str1 = "loop" ;
        String str2 = new String ("loop") ;

        System.out.println("Comparing with == " + (str1 == str2));            //comparing memory location
        System.out.println("COmparing with .equals () " + str1.equals(str2)); // comparing values


        System.out.println("Comparing with .equals () " + str1.equals("loop"));
        System.out.println("Comparing with .equals () " + "loop".equals(str2));
        System.out.println("Comparing with .equals () " + new String ("loop").equals(str2));

        System.out.println();

        System.out.println();

        System.out.println("Comparing with .equalsIgnoreCase() " + str1.equalsIgnoreCase("loop"));
        System.out.println("Comparing with .equalsIgnoreCase() " + str1.equalsIgnoreCase("LOOP"));
        System.out.println("Comparing with .equalsIgnoreCase() " + str1.equalsIgnoreCase("Loop"));

        System.out.println();

       boolean result =  "LOoP".equalsIgnoreCase(new String ("lOOp"));
        System.out.println(result);


    }
}
