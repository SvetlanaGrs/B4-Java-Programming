package day22_arrays;

public class MinMax {
    public static void main(String[] args) {
        int [] nums = {500, 120, -80, 90, 250, -10};
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        for (int each:nums) {
            if (each>max) {
                max = each;
            }
            if (each<min) {
                min = each;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
