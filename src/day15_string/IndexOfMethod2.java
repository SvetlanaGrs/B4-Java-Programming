package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String str = "java";
        //            0123
        System.out.println(str.indexOf("a"));          //1
        System.out.println( str.lastIndexOf("a")); //3
        System.out.println( str.lastIndexOf('a')); //3

        System.out.println("----------------");

      String str2 = "cbacbcebcbcbacb";
      //             0123456789
        System.out.println(str2.indexOf("ac"));
        System.out.println(str2.lastIndexOf("ac"));//12

        System.out.println("------------------");
        System.out.println(str2.indexOf("ac" , 4));//12
        System.out.println(str2.lastIndexOf("ac", 4));//2
        System.out.println(str2.lastIndexOf("cb" , 11));//10

    }
}
