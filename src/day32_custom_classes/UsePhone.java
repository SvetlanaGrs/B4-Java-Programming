package day32_custom_classes;
//runner class - main() method is used to start the execution
public class UsePhone {
    public static void main(String[] args) {
        //Reference     Object
       // Phone phone1 = new Phone();

        //Instead of giving initial values like below - we can use constructor
//        phone1.name="Iphone 16 Pro";
//        phone1.brand="Apple";
//        phone1.memory=128;
//        phone1.version=18.2;
        Phone phone1 = new Phone("Iphone 16 Pro", "Apple", 128, 18.2);
        System.out.println(phone1);// by default it calls toString().

        Phone phone2 = new Phone("Iphone 12 Mini");
        System.out.println(phone2);

        System.out.println();
        Phone phone3= new Phone("Iphone 16 Pro MAX", "Apple", 512);
        System.out.println(phone3);
    }
}
