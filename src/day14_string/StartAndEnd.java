package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Loopcamp";
        String str2 = "LOOp";

        System.out.println( str.startsWith("Loop"));
        System.out.println( str.startsWith("loop"));

        System.out.println();
        //Here, improved/implemented the code in a way that it does not case about CASE SENSITIVITIES
        System.out.println( str.toLowerCase().startsWith("loop".toLowerCase()));
        System.out.println( str.toLowerCase().startsWith(str2.toLowerCase()));

        System.out.println();

        System.out.println(str.startsWith("Loopcamp"));
        System.out.println(str.startsWith("Loopcamp@"));

        String str3 = "Loop";
        System.out.println(str.startsWith(str3));
        System.out.println(str.startsWith(" Loop"));
        System.out.println(str.startsWith(     "Loop"));

        System.out.println();
        String sentence = "Thursday is a Java class day";
        System.out.println(sentence.startsWith("Thu"));
        System.out.println(sentence.startsWith("Thursday is "));
        System.out.println(sentence.startsWith("is"));

        System.out.println();
        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("ss day"));
        System.out.println(sentence.endsWith("Thursday is a Java class day"));
        System.out.println(sentence.endsWith("hursday is a Java class day"));
        System.out.println(sentence.endsWith("TThursday is a Java class day"));

       boolean hasSameBeggining =  str.startsWith("Loop");
       boolean hasSameEnd =  str.startsWith("Loopcamp");
        System.out.println(hasSameBeggining);
        System.out.println(hasSameEnd);

        //System.out.println(str.startsWith('L'));


    }
}
