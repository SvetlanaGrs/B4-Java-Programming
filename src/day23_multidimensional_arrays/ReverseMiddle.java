package day23_multidimensional_arrays;

public class ReverseMiddle {
    public static void main(String[] args) {
        String str = "java always fun";
        String [] strArr = str.split(" ");
        //Option1 - substring(index1 space, index 2nd space
        //Option2 - get the element at the index1
        String middle = strArr[1]; // always
        String midReversed = "";

        //Option2
        char [] letter = middle.toCharArray(); //[a, l ,w, a, y, s]
        for (int i = letter.length-2; i >=0 ; i--) {
            midReversed+=letter[i];
        }
        System.out.println(midReversed);
        System.out.println(strArr[0 ] + " " + midReversed + " " + strArr[2]);


    }
}
