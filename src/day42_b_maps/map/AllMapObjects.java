package day42_b_maps.map;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        //<teacherName, className>
        Map <String,String> map1 = new HashMap<>();
        map1.put("feyruz", "Java");
        map1.put("nadir", "Selenium");
        map1.put("Diana", "MentorGroup2");
        map1.put("Iryna", "MentorGroup1");
        map1.put(null, "GeneralText"); //null is OK as key
        map1.put("test", null); //null is OK as value
        map1.put("check", null); //null is OK as value
        System.out.println(map1);
        //HashMap: NO DUPLICATE KEY   - DUPLICATE VALUES OK-    Random order - null as KEY is allowed

        Map <String,String> map2 = new LinkedHashMap<>();
        map2.put("feyruz", "Java");
        map2.put("nadir", "Selenium");
        map2.put("Diana", "MentorGroup2");
        map2.put("Iryna", "MentorGroup1");
        map2.put(null, "GeneralText"); //null is OK
        map2.put("test", null); //null is OK as value
        map2.put("check", null); //null is OK as value
        System.out.println(map2);
        //LinkedHashMap: NO DUPLICATE KEY   -    Insertion order - null as KEY is allowed

        Map <String,String> map3 = new TreeMap<>();
        map3.put("feyruz", "Java");
        map3.put("nadir", "Selenium");
        map3.put("Diana", "MentorGroup2");
        map3.put("Iryna", "MentorGroup1");
        //map3.put(null, "GeneralText"); //null is NOT OK as key
        map3.put("test", null); //null is OK as value
        map3.put("check", null); //null is OK as value
        System.out.println(map3);
        //LinkedHashMap: NO DUPLICATE KEY   - Sorted order(ASCII) - null as Value is allowed , null is NOT OK as key

        Map <String,String> map4 = new Hashtable<>();
        map4.put("feyruz", "Java");
        map4.put("nadir", "Selenium");
        map4.put("Diana", "MentorGroup2");
        map4.put("Iryna", "MentorGroup1");
        //map4.put(null, "GeneralText"); //null is NOT OK as key
        //map4.put("test", null); //null is NOT OK as value
        //map4.put("check", null); //null is NOT OK as value
        System.out.println(map4);
        //LinkedHashMap: NO DUPLICATE KEY   - Random order - null as Value is NOT allowed , null is NOT OK as key - SYNCHRONIZED (Thread-safe)

    }
}
