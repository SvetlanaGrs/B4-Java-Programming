package day30_b_custom_classes;

//This is my runner class - main method - execution starts from there
public class UsingApp {
    public static void main(String[] args) {

        //System.out.println(name) NOT VALID

        //Create an object of App class called application1
        //Object reference = actual object

        App application1 = new App();
        //application1 has its own copy "name" , "version", "isFree" INSTANCE variables


        App application2 = new App();
        //application2 has its own copy "name" , "version", "isFree" INSTANCE variables

        application1.name="loopcamp";
        application1.version = 4.0;
        application1.isFree = true;

        System.out.println(application1.version); //4
        System.out.println(application2.version); //0 - default value

       // App.run(); // Since run method is instance method - we can not call it by Class name

        application1.run();
        application2.run();

        application2.name = "Excel";
        application2.version= 23.5;
        application2.isFree = false;
        application2.run();

        System.out.println("---------------");
        System.out.println(application1.version);
        System.out.println(application2.version);

        System.out.println();
        application1.update();
        System.out.println(application1.version);

        System.out.println();
        application2.update();
        System.out.println(application2.version);
    }



}
