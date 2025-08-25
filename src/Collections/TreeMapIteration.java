package Collections;

import java.util.TreeMap;

public class TreeMapIteration {
    public static void main(String[] args){
        TreeMap<String,Integer> student =new TreeMap<>();
        student.put("Diya",7);
        student.put("Jasmine",9);
        student.put("Aman",1);
        student.put("Piyush",4);

        for(String s: student.keySet()){
            System.out.println(s+" "+student.get(s));
        }
    }
}
