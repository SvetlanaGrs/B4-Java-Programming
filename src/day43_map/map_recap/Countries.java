package day43_map.map_recap;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        //Store multiple cities in one data structure
        //...and store that container into another data structure that country has those cities

        //New York, Fairfax, Bellevue, Miami , Arlington ---> United States
        //Baku, Sumgavit, Ganja-----------------------------> Azerbaijan
        //Lyon, Paris---------------------------------------> France
        //Toronto, Vancouver, Ontario-----------------------> Canada

        //Sample containers
        //String str=...
        //String [] cities1=...
        //List <String> cities1 = new ArrayList<>(Arrays.asList("...."));
        //Set <String> cities1 = new HashSet<>(Arrays.asList("...."));

        List<String> cities1 = new ArrayList<>(Arrays.asList("New York", "Fairfax", "Bellevue", "Miami" , "Arlington"));
        List<String> cities2 = new ArrayList<>(Arrays.asList("Baku", "Sumgavit", "Ganja"));

        Map <String, List<String>> countries = new LinkedHashMap<>();
        countries.put("United States", cities1);
        System.out.println(countries);

        countries.put("Azerbaijan", cities2);
        System.out.println(countries);

        countries.put("France", new ArrayList<>(Arrays.asList("Lyon", "Paris")));
        System.out.println(countries);

        //Can you print out the cities which has "i" in the name
        for (String each:countries.keySet()){
            //countries.get(each); //will return the value assign to this each on every cycle--> List<String>
            for (String eachCity: countries.get(each)){

                if(eachCity.contains("i")){
                    System.out.println(eachCity);
                }
            }
        }
        System.out.println("----------------------------");

        //Option2
        for(List<String> eachList: countries.values()){
            for(String each: eachList){
                if(each.contains("i")){
                    System.out.println(each);
                }
            }
        }

        //TODO: Option 3 - do it with Map.Entry / entrySet()

    }
}
