package day33_a_static;

public class BestBuy {
    //Instance variable- belongs to each object. each has its own copy
    String location;

    //static variable - belongs  to all objects. One same copy for all
    static String headquarter="7601 Penn Ave South, Richfield, Minnesota";
    static String specialDay = "28 Dec";

    //Constructor - helps to initialize the instance variables
    public BestBuy (String location){
        this.location=location;
    }

    //Instance method - NON - STATIC METHOD
    public void openStore(){
        System.out.println("Opening the store in location: "+ location);
    }

    //static method
    public static void specialDaySale (){
        System.out.println("there %40-%70 discount on " + specialDay);
        //Static only Accepts static
    }


    /**
     * static
     *  - all objects share/ have the ONE/SAME copy
     *  - if it changes/updated , all objects are effected
     *  - we use class name to reach static members
     *  - Possible to used the object reference as well- but not goof approach
     *  - Static only Accepts static members
     *  - We can not use 'this.' keyword
     *
     * instance
     *  - every object has its OWN copy
     *  - if instance for one object is changed/updated, it only affects that objects
     *  -We use object reference to reach instance members
     *  -  NOT possible to use the Class Name to reach the instance members
     *  - Instance accepts BOTH static and instance members
     */
}
