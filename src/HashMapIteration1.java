import java.util.*;
public class HashMapIteration1 {
public static void main(String [] args){
    HashMap<String,String> parentChild = new HashMap<>();
    parentChild.put("Jagdish", "Ramesh");
    parentChild.put("Rakesh","Vishal");
    parentChild.put("Amrit","Janvi");
    parentChild.put("Lokesh","Parth");
    parentChild.put("Dinesh","Dev");

    for(String i : parentChild.values()){
        System.out.println(i);
    }
    System.out.println();

    for (String i : parentChild.keySet()){
        System.out.println(i);
    }
}
}
