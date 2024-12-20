package day29_arraylist;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {
        ArrayList <String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "DevOps","QA", "QE", "BA"));
        System.out.println("Original: " + allJobs);

        //removeAll
        ArrayList <String> jobs1 = new ArrayList<>(allJobs);
        //jobs1.removeAll("QA","BA")   NOT VALID
        jobs1.removeAll(Arrays.asList("QA", "PO", "QE","BA"));
        System.out.println("After 1st remove: " + jobs1);

        //retainAll
        ArrayList <String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET"));
        System.out.println(jobs2);

        //.containsAll()
        ArrayList <String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("DevOps", "PO")));
        System.out.println(jobs3.containsAll(Arrays.asList("DevOps", "PO", "QI")));
    }
}
