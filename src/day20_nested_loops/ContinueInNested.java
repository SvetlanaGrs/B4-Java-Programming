package day20_nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {
//OUTTER
        for (int i = 0; i < 5; i++) {

            if (i==3){
                continue;
            }
            System.out.println("i: " + i);
            //INNER
            for (int j = 0; j < 3; j++) {
                if (j==1){
                    continue;
                }
                System.out.println("j: " + j);
            }
        }
        System.out.println("End");
    }
}
