package day32_custom_classes;
//Runner class - execution starts from main()
public class Jobs {
    public static void main(String[] args) {
        Offer offer1 = new Offer("Apple", "CA");
        System.out.println(offer1);

        Offer offer2 = new Offer("Austin, TX", "Tesla", 140_000, true, 15);
        System.out.println(offer2);
    }
}
