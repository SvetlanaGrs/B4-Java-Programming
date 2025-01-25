package day27_wrapper_array;

public class ParseNumber {
    public static void main(String[] args) {
            /*
                Data type           Value                  Convert to be WRAPPER                                   Convert to be PRIMITIVE
    "1"    ----  String   -------  Number  --------  Byte.valueOf("1")---------->Byte b =1--------------------Byte.parseByte("1")----------------byte b=1
    "true" ----  String   -------  Boolean                                                                    Boolean.parseBoolean("true")-------boolean b1 = true
     */


//    if ("true"){
//        System.out.println("Pass");
//    }


        if (Boolean.parseBoolean("true")) {
            System.out.println("Pass");
        }


        String year = "2024";
        System.out.println("Current year is " + year);
        System.out.println("Next year is " + year+1); // Concatenation

        int yearInNum1 = Integer.parseInt(year);
        //OR
        Integer yearInNum2 = Integer.valueOf(year);
        System.out.println("Next year is " + (yearInNum1 + 1));
    }
}
