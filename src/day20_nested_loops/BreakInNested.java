package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {
        //OUTTER
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            if ( i ==3) {
                break;
            }
            //INNER
            for (int j = 0; j < 3; j++) {
                System.out.println("j: " + j);
                break;
            }
        }
        int k = 5;
        for (int i = 0; i < k; i++) {
            break;
        }
    }
}
