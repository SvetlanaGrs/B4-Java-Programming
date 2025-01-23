package day43_map.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {
        Map <String, Double> store = new HashMap<>();

        //1.1 - .put(key,value)
        store.put("Water", 2.9);
        store.put("Bread", 1.8);
        store.put("Cheese", 1.4);
        store.put("Coffee", 1.4);
        store.put("Potato", 1.2);
        System.out.println(store);

        //1.2 -.put(key,value)--->updated the value which was linked to the EXISTING key
        store.put("Bread",2.1);
        System.out.println(store);

        //2 - .get(Key) ---> return the value that is assigned to the given KEY
        System.out.println(store.get("Water"));
        System.out.println(store.get("Apple")); //Doesnt exist->return null

        //3 - .remove(key)
        store.remove("Water");
        System.out.println(store);

        //4 - .containsKey(key);
        System.out.println(store.containsKey("Water"));

        //5 - .containsValue(value);
        System.out.println(store.containsValue(2.1));
        System.out.println(store.containsValue(1.4));

        //6 - .size()---> it returns the number of the KEY-VALUE PAIRS (Number of the ENTRYs)
        System.out.println(store.size());

        System.out.println("---------------------------------------------");
        //7 - .keySet()
        System.out.println(store.keySet());
        Set <String> keysInStore= store.keySet(); //returns Set interface
        System.out.println(keysInStore);

        //8 - .values();
        System.out.println(store.values());
        Collection<Double> valuesInStore = store.values();//returns Collection interface
        System.out.println(valuesInStore);

        System.out.println("---------------------------------------------");
        //8.a - loop through KEYS
        //can not use fori - Map not allow INDEXES
        for(String eachKey : store.keySet()){
            System.out.print(eachKey);
            System.out.println("-"+ store.get(eachKey));
        }
        System.out.println("**************************************************");
        //8.b - loop through VALUES
        store.values(); //COllection <Doubles>
        for(Double eachValue:store.values()){
            System.out.println(eachValue);
        }

        System.out.println("**************************************************");
        //9 - loop through Map (KEY-VALUE / ENTRY'S)
        store.entrySet();
        /*
        Potato-1.2  ---> entrySet --> just one Map <KEY, VALUE>
        Cheese-1.4  ---> entrySet --> just one Map <KEY, VALUE>
        Coffee-1.4  ---> entrySet --> just one Map <KEY, VALUE>
        Bread-2.1   ---> entrySet --> just one Map <KEY, VALUE>
         */
        System.out.println("---------------------------------------------");
        for (Map.Entry <String,Double> eachPair :store.entrySet()){
            System.out.println(eachPair); //each KEY-VALUE pair is now assigned to a SINGLE MAP
            System.out.println(eachPair.getKey());
            System.out.println(eachPair.getValue());
            System.out.println("Item : " + eachPair.getKey() + "\tValue: " + eachPair.getValue());
        }
    }
}
