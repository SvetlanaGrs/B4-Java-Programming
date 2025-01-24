package day44_map_and_function.string_sbuilder_sbuffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {
        //1.String
        String str1 = "loopcamp";                            //Stored in String Pool in Heap
        String str2 = new String("loopcamp");        //Stored it in directly Heap
        str1 = str1+str2;                                   //This line created completelly a new object in Heap
        System.out.println("String: " + str1);

        System.out.println("--------------");
        //2. StringBuilder
        //StringBuilder is MUTABLE - can only be created by 'new' keyword

        StringBuilder strBuilder1 = new StringBuilder("loopcamp"); //I stored it in directly in HEAP
        System.out.println(strBuilder1);
        strBuilder1.append("loopcamp");                     //This line doesnt create a new object, it updates

        System.out.println("strBuilder1 = " + strBuilder1);

        //3. StrinBuffer()
        StringBuffer stringBuffer1 = new StringBuffer("loopcamp");
        System.out.println("stringBuffer1 = " + stringBuffer1);
       // StringBuffer stringBuffer2 = "loopcamp";
        stringBuffer1.reverse();                                //This line does NOT create a new object-it is updates existing one
        System.out.println("stringBuffer1 = " + stringBuffer1);
    }
}
