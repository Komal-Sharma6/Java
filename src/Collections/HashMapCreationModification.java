package Collections;

import java.util.HashMap;
public class HashMapCreationModification {
    public static void main(String [] args){
        //HashMap Creation
        HashMap<String,String> capitalCities = new HashMap<>();

        //HashMap Modification

        //Adding items
        capitalCities.put("Rajasthan","Jaipur");
        capitalCities.put("Uttar Pradesh","Lucknow");
        capitalCities.put("Bihar","Patna");
        capitalCities.put("Maharashtra","Mumbai");
        capitalCities.put("Odisha","Bhubaneswar");

        System.out.println(capitalCities);

        //Accessing Item

        System.out.println(capitalCities.get("Bihar"));

        //Remove Item

        capitalCities.remove("Maharashtra");
        System.out.println(capitalCities);

        //Find out how many items present

       System.out.println( capitalCities.size());

       // To Remove all the items

       capitalCities.clear();
       System.out.println(capitalCities);
    }
}
