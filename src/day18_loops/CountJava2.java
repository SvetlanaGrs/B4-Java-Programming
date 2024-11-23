package day18_loops;

public class CountJava2 {
    public static void main(String[] args) {
        String str ="java is a good coding language and java requires good logics java";
        //           0123456                                                         java
        int countJava = 0;


        while(  str.contains("java")  ){
            str = str.replaceFirst("java", "*");
            countJava++;
        }
        System.out.println("There are " + countJava + " \"java\" in the string");
        System.out.println(str);
    }
}
