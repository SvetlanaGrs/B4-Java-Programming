package day39_a_polymorphism.cloth;

import day35_inheritance.super_parathesis.C;
import day36_inheritance_continue.access_modifier.b.Third;

public class Store {
    public static void main(String[] args) {
        //All possible reference of TSHirt
        //1 - itself
        TShirt t1 = new TShirt();
        t1.wearClothes();

        //2 parent class
        Clothes t2 = new TShirt() ;
        t2.wearClothes();

        System.out.println("------------------------------");

        //All possible references of jacket
        //1 -itself
        Jacket j1 = new Jacket();
        j1.wearClothes();
        j1.putOnHood();

        //2 - parent class
        Clothes j2 = new Jacket();
        j2.wearClothes();
       // j2.putOnHood(); no access//Reference side(Clothes) doesnt have access to putOnHood method


        //3 - Interface which is implemented by  Jacket class
        HasHood j3 = new Jacket();
        j3.putOnHood();
        //j3.wearClothes() //Reference side(HasHood) doesnt have access to WearClothes method

        //4 - Object class- is a parent of all classes
        Object j4 = new Jacket();
        //j4.wearClothes();Reference side(Object) doesnt have access to WearClothes method
        //j4.putOnHood();Reference side(Object) doesnt have access to putOnHood method
        System.out.println("**********************");

        TShirt tshirt = new TShirt();
        //References can be : istself and parent
        buy(tshirt);
        buy(new TShirt());

        Jacket jacket = new Jacket();
        //Possible references: itself, parent, interface
        buy(jacket);
        buy(new Jacket());


        test(1);
    }

    //CLothes clothes = new TSHirt();
    //Clothes clothes = new Jacket();
    public static void buy(Clothes clothes){

        if(clothes instanceof Clothes){
            System.out.println("Bought clothes");
        }
        if(clothes instanceof TShirt) {
            System.out.println("Bought a TShirt");
        }else if(clothes instanceof Jacket){
            System.out.println("Bought a Jacket");
        }

    }

    public static void test(double d){

    }
}
