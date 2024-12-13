package day26_methods;

public class Picture {
    //method------------->is a code of block that does some function/action
    //this method is ---->public---> available anywhere in whole project
    //method is --------->static---> this method can be called by class name
    //method is --------->void-----> in terms of what this method is returning, it is VOID method
    //method is ---------> non-parametrized---> meaning nothing in the parenthesis, no parameters in ();
   public static void draw () {
       System.out.println("Trying to draw");
   }


//!!!!!!CAN NOT have same method name + same () style
    // because when this method is called- JAVA would not know which method to call
//    public static void draw () {
//        System.out.println("Trying to draw");
//    }

    public static void draw (String color){
        System.out.println("Trying to draw with " + color + " color.");
    }

    //Also can not use it----cause the same data type, variable name doesnt matter
//    public static void draw (String clr){
//        System.out.println("Trying to draw with " + clr + " color.");


public static void draw (String color1, String color2){
    System.out.println("Trying to draw with " + color1 +" and " + color2 + " color.");
}

    public static void draw (String color1, String color2, String color3){
        System.out.println("Trying to draw with " + color1 +" and " + color2 + " and " + color3+ " color.");
    }

    public static void draw (int num, String color){
        System.out.println("Trying to draw with " + num +" different tones of " + color + " colors.");
    }

    public static void draw (String color, int num){
        System.out.println("Trying to draw with " + num +" different tones of " + color + " colors.");
    }

    public static void draw ( int num){
        System.out.println("Trying to draw with " + num +" brashes");
    }

    public static void draw ( boolean isPainted){
        System.out.println("This is already painted: " + isPainted);

    }

//    public static String draw (boolean isPainted) {
//        System.out.println("This is already painted: " + isPainted);
//        return "";
//    }


    public static String draw (double num) {
        System.out.println("This is already painted: " + num);
        return "";
    }
}
