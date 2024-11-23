package day11_if_statements;

public class Diver {
    public static void main(String[] args) {
//        Scanner key = new Scanner(System.in);
        int oxygenLevel = 80;

        if (oxygenLevel>=50 && oxygenLevel <60) {
            System.out.println("Be carefull");
        }else if (oxygenLevel >= 60 && oxygenLevel<70) {
            System.out.println("Start to head back");
        }else if (oxygenLevel >= 70 && oxygenLevel<80) {
            System.out.println("Don't go too far");
        }else if (oxygenLevel >= 80 && oxygenLevel<90) {
            System.out.println("Still okay");
        }else if (oxygenLevel >=90 ) {
            System.out.println("Your tank is full");
    }
}
}
