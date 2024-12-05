package day22_arrays;

import java.util.Arrays;

public class equals {
    public static void main(String[] args) {
        int [] a = {1, 2 ,3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c = a;

        System.out.println(a == b);  // DO NOT use when comparing arrays or objects
        System.out.println(a == c);  // Still do not use

        System.out.println();
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));
        System.out.println(Arrays.equals(b,c));

        boolean result = Arrays.equals(a,b);
        System.out.println(result);

        System.out.println();
         int [] d = {4, 3, 2, 1};
        System.out.println(Arrays.equals(a,d));

        //d = Arrays.sort(d) // doesnt return anything

        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));




    }
}
