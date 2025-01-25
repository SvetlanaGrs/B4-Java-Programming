package day26_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int [] numArr = {12, 34, 6, 78, 34, 9, 33};


        String str = "Loopcamp";

        str.indexOf("o");
        str.indexOf("o", 3);
        str.indexOf("o", 3, 5);

        //result -1: if it not find


        System.out.println(indexOf(numArr, 78));
        System.out.println();

        String [] word = {"java", "selenium", "api"};
        //                  0          1        2
        System.out.println(indexOf(word, "api"));

    }

    public static int indexOf (int [] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==num ) {
                index=i;
                break;
            }
        }
        return index;
    }

    public static int indexOf (String [] arr, String word) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                index=i;
                break;
            }
        }
        return index;
    }
}
