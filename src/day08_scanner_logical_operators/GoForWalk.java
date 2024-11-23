package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {

        boolean isRaining = true;
        int temp = 80;

        boolean isGoodToWalk = !isRaining && temp > 70 ;
        //AND ---> true and true-----> true
        System.out.println("Is it good to go for a walk: " +isGoodToWalk);

    }
}
