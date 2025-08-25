package Collections;
import java.util.*;
public class TreeSetOperations {
    public static void main(String[] args){
        TreeSet<String> name = new TreeSet<>();
        name.add("Priya");
        name.add("Aazad");
        name.add("Abhinav");
        name.add("Vanshika");

        // Checks whether the element exists or not
        System.out.println(name.contains("Jiya"));

        //To remove an element
        name.remove("Aazad");

        //To check the  size of set
        System.out.println(name.size());

        // To remove all the elements from the set
        // name.clear();

        //Elements will be sorted automatically unlike HashSet
        System.out.println(name);

    }

}
