import java.util.*;
public class HashMapSearching {
public static void main(String[] args){
    HashMap<String,Integer> people = new HashMap<>();
    people.put("Ram",80);
    people.put("Shyam", 56);
    people.put("Dev",54);
    people.put("Jamna",76);

    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    if(people.containsKey(n)){
        System.out.println(n+" "+people.get(n));
    }
    else {
        System.out.println(people.containsKey(n));
    }
}
}
