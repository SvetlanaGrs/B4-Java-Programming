package day04_variables;

public class FloatingNumbers {
    public static void main(String[] args) {


        System.out.println(3);
        System.out.println(4);

        System.out.println(3 + 4);
        System.out.println(3 * 4);
        System.out.println(3 /4); //0.75 -----> whole number portion 0
        System.out.println(13 /4); //3.25-----> whole number portion 3

        double price = 10.99; // this is the way to store decimals numbers with fractions. USED MOSTLY with decimals numbers
        float gpa = 3.4f;     // this is another way you store decimals numbers. You must use F or f

        System.out.println(price); // Datatype double
        System.out.println(gpa);// Datatype float
        System.out.println(5.6);// Datatype double BY DEFAULT
        System.out.println(3.0/4); // Datatype is bigger - its 3.0-----> result will be the bigger datatype. it means that result not 0, becaude its double
        System.out.println(13.0/4);
        System.out.println(13/4.8);


    }
}
