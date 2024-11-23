package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {
        int a = 70;
        String result;

//        Option 1
        if (a % 2 == 0) {
//            System.out.println("Even Number");
            result = "Even Number";
        }else {
//            System.out.println("Odd Number");
            result = "Odd Number";
        }
        System.out.println(result);

//        Option 2- with TERNARY
        //Condition ? value1 : value2
        //value 1 ---- if condition is TRUE
        //value 2 ---- if condition is FALSE
       // result = a % 2 == 0 ? "Even Number" : "Odd number";


        System.out.println(a % 2 == 0 ? "Even Number" : 34) ;
        System.out.println(a % 2 == 0 ? "Even Number" : true) ;


        System.out.println("-----------------------------");
        int n =50;
        System.out.println(50>0 ? "Positive": "Negative");

        String str = 50 < 0 ? "+" : "-";
        System.out.println(str);
    }
}
