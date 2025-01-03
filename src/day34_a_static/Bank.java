package day34_a_static;

public class Bank {
    public static void main(String[] args) {
        DebitCard card1 = new DebitCard(12345, "John Smith", 100.0);
        DebitCard card2=new DebitCard(1234567890123456l, "Winnie Pooh", "amex", 12345, 200.00);

        DebitCard card3=new DebitCard(1234567890123456l, "Winnie Pooh", "visa", 1234, 200.00);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}
