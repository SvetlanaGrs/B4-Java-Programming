package day11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        double price = 20.99 ;
        boolean hasPrime = false ;
        if (hasPrime) {
            System.out.println("Eligible for 2 days shipping");
        } else {
            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            }else {
                price +=3.99;
                System.out.println("Not eligible for regular free shipping. Fee: 3.99");
            }
        }
    }
}
