package day36_inheritance_continue.access_modifier.b;

import day36_inheritance_continue.access_modifier.a.First;

public class Fourth {

    public static void main(String[] args) {
        First f = new First();
        System.out.println( f.one );
        //System.out.println( f.two ); // protected - parent class object - not accessible
        //System.out.println( f.three ); // default is not accessible out side of the package
        //System.out.println( f.four );   // private is not accessible out side of the class

        Fourth f4 = new Fourth();
        //System.out.println(f4.one);
        //System.out.println(f4.two);
        //System.out.println(f4.three);
        //System.out.println(f4.four);
    }
    /*
        Since there is not inheritance and non of instance variables inherited to Fourth class from First class
     */
}