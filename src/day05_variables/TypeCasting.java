package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b; // the byte value is CONVERTED automatically into int. Because bite is smaller than int.

//        int x;
//        double y = 2.5;
//       // x=y CANNOT DO THIS


//        int x2;
//        short y2 =4;
//        x2= y2;

        int i2 = 100;
        //byte b2 = i2; // the int value can not automatically converted into bite

        byte b2 = (byte)i2; //since we cannot automatically convert int into byte , we can use CASTING

        System.out.println(i2);
        System.out.println(b2);
        System.out.println();

        int i3 = 150;
        byte b3 = (byte)i3; // byte range is -128 to 127--->then DATA LOSS os happening
        System.out.println(i3);
        System.out.println(b3);

        double d1 = 34.6;
        int i4 = (int)d1;
        System.out.println(d1); // AFter casting it will keep the whole portion and loose decimal part-----NARROWING CONVERSION
        System.out.println(i4);

        int i5 = 46;
        double d5 = i5; // CONVERSION happens AUTOMATICALLY------> WIDENING CONVERSION
        System.out.println(i5);
        System.out.println(d5);


    }
}
