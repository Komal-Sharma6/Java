package Collections;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<>();

        //To add elements
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW"); // BMW will be printed only once because it doesn't allow dubplicate values.
        cars.add("Honda");

        //To check whether the element exists or not
        System.out.println(cars.contains("Hundai"));

        //To remove element from the set
        cars.remove("Volvo");

        //To know the size of set
        System.out.println(cars.size());

        //To remove all the elements
        // clear() method can be used
        System.out.println(cars);
    }
}
