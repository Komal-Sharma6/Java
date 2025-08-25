package Collections;

import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args){
        TreeMap<String,Integer> student =new TreeMap<>();
        student.put("Diya",7);
        student.put("Jasmine",9);
        student.put("Aman",1);
        student.put("Piyush",4);
        // To get a particular element through key
        System.out.println(student.get("Diya"));

        //To remove element
        student.remove("Piyush");

        //To get the no. of elememts in the collection
        System.out.println(student.size());

        //To remove all the elements fron the collection
        // student.clear();

        //Maintains order unlike HashMap
        System.out.println(student);
    }
}
