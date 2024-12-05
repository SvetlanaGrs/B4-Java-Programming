package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "monday tuesday wednesday thursday friday saturday sunday";
        System.out.println(str.length());

        String [] days = str.split(" ");
        System.out.println(days.length);
        System.out.println(Arrays.toString(days));

        for (String eac:days) {
            System.out.println(eac);
        }

        System.out.println("-------------------------");
        String [] days2 = str.split("day");
        System.out.println(Arrays.toString(days2));

        for (int i = 0; i < days2.length; i++) {
            days2[i] = days2[i].trim(); // We removed spaces from each element
        }
        System.out.println(Arrays.toString(days2));

        System.out.println("-------------------------");
        String [] days3 = str.split("day ");
        System.out.println(Arrays.toString(days3));

        System.out.println("--------------------------");
        String [] days4 = str.split("");
        System.out.println(Arrays.toString(days4));

        System.out.println("--------------------------");
        String  month = "Jan-Feb-Mar-Apr-May-Jun-July";
        String [] monthArr = month.split("-");
        System.out.println(Arrays.toString(monthArr));

        System.out.println("--------------------------");
        String [] monthArr2 = month.split("Apr");
        System.out.println(monthArr2.length);
        System.out.println(Arrays.toString(monthArr2));

        System.out.println("--------------------------");
        String [] monthArr3 = month.split("Dec");
        System.out.println(monthArr3.length);
        System.out.println(Arrays.toString(monthArr3));
    }
}
