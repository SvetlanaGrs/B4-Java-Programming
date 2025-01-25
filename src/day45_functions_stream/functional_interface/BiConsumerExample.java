package day45_functions_stream.functional_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // Create an
        BiConsumer<String, Integer> printNTimes = (str, n) -> {
            for (int i = 1; i <=n ; i++) {
                System.out.println(str);
            }
        };
        printNTimes.accept("Hello", 10);
        printNTimes.accept("Java", 22);

        System.out.println("------");

        Map <String, Integer> map = new LinkedHashMap<>();
        map.put("Java", 5);
        map.put("Python", 3);
        map.put("CI/CD", 6);

        //.forEach() with Map accepts BiConsumer
        //(T t, U u) -> {}
        //On every cycle with forEach loop take each KEY-VALUE pair use for BiConsumer input
        map.forEach((eachKey, eachValue)->{
            System.out.println(eachKey + " : " + eachValue);
        });

        System.out.println("---------------------");
        map.forEach((K ,V)->{
            System.out.println(K + " has " + K.length() + " characters");
        });
    }
}
