package Collections;

import java.util.HashMap;
import java.util.Map;
public class HashMapIterationEntrySet {
public static void main(String[] args){
    HashMap<String,Integer> country = new HashMap<>();

    country.put("India",120);
    country.put("Afganistan",110);
    country.put("England",90);
    country.put("USA",80);

    for(Map.Entry<String,Integer> e : country.entrySet()){
        System.out.print(e.getKey()+" ");
        System.out.print(e.getValue());
        System.out.println();
    }
    System.out.println(country);

}
}
