package day15_string;

public class IndexOf {
    public static void main(String[] args) {
        String str = "penpen";
        //            012345
        System.out.println( str.indexOf ('p'));
        System.out.println( str.indexOf ("p"));
        //CHar cannot hold more than a single character "pe"
        char first = str.charAt(0);
        System.out.println(str.indexOf(first));

        System.out.println("--------------");

        System.out.println(str.indexOf("pe"));
        System.out.println(str.indexOf("np")); //2

        System.out.println("--------------");
        System.out.println(str.indexOf('e')); //1
        System.out.println(str.indexOf("pen")); //0

        System.out.println("--------------");
        System.out.println(str.indexOf('x')); //-1
        System.out.println(str.indexOf("Pen")); //-1
        System.out.println(str.indexOf("PEN")); //-1

        System.out.println("--------------");
//        String str = "penpen";
        //              012345

        System.out.println(str.indexOf('e')); //1
        System.out.println(str.indexOf('e',1)); //1
        System.out.println(str.indexOf('e',2)); //4

        System.out.println(str.indexOf("e",1)); //1
        System.out.println(str.indexOf("e",2)); //4

        System.out.println(str.indexOf("en",1)); //1
        System.out.println(str.indexOf("en",2)); //4

        System.out.println(str.indexOf("np",3)); //-1
        System.out.println(str.indexOf("np",10)); //-1

        System.out.println(str.indexOf("np")); //2

    }
}
