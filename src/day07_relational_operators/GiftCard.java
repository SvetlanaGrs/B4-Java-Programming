package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200; //type conversion (widening)---> implicitly (auto casting)
        double item1 = 10;
        double item2 = 25.9;

        System.out.println("I have $" + giftCard + " balance in my gift card");
        System.out.println(" I bought a cup for $ " + item1 );
        //giftCard = giftCard - item1
        giftCard-= item1;
        System.out.println("After purchasing the cup, i have $" + giftCard + " balance");
//      We can do the code below as well, to combine two statements into one
//        System.out.println("After purchasing the cup, i have $" + (giftCard-= item1) + " balance");
        System.out.println("I bought a T-shirt for " + item2 );
        System.out.println("After purchasing the T-shirt i have " +(giftCard-= item2) + " balance");

    }

}
