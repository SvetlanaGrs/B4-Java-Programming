package day43_map.map_recap;
//INTERVIEW QUESTION


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String word = "loopcamp";
        // 1 - use the nested loop
        // 2 - use the Map


        //l - 1
        //o - 2
        //p - 2
        //c - 1
        //a - 1
        //m - 1

        frequencyOfCharacters(word);
        frequencyOfCharacters("Wednesday");
        System.out.println("-------------------------");
        System.out.println(frequencyOfCharacters2("Selenium"));

        System.out.println("-------------------------");
        //print the unique letters --->"Java"
       Map<Character,Integer> map2 = frequencyOfCharacters2("Java");
        System.out.println(map2);
        for (Integer eachValue:map2.values()){
            System.out.println(eachValue);
        }
        String unique="";
        for (Character eachKey:map2.keySet()){
            if(map2.get(eachKey)==1){    // map2.get(j)-->1
              unique+=eachKey;

            }
        }
        System.out.println(unique);

        System.out.println("-------");
        String duplicate="";
        for (Character eachKey:map2.keySet()){
            if(map2.get(eachKey)>1){    // map2.get(j)-->1
                duplicate+=eachKey;

            }
        }
        System.out.println(duplicate);
    }

    public static void frequencyOfCharacters (String word){
        Map <Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <word.length() ; i++) {
            Character eachChar = word.charAt(i); //char ---> Character [Wrapper class - object representative of primitive data types]

            if(!map.containsKey(eachChar)){
                map.put(eachChar, 1);
            }else {
                map.put(eachChar,map.get(eachChar)+1);
            }

        }
        System.out.println(map);
    }

    public static Map<Character,Integer> frequencyOfCharacters2 (String word){
        Map <Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <word.length() ; i++) {
            Character eachChar = word.charAt(i); //char ---> Character [Wrapper class - object representative of primitive data types]

            if(!map.containsKey(eachChar)){
                map.put(eachChar, 1);
            }else {
                map.put(eachChar,map.get(eachChar)+1);
            }

        }
        return map;
    }

}
