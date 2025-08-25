package Collections;

import java.util.HashMap;
public class HashMapIteration2 {
    public static void main(String[] args){
        HashMap<Integer,String> rollNoStudent = new HashMap<>();
        rollNoStudent.put(1001 , "Divya");
        rollNoStudent.put(1002 , "Anubhiva");
        rollNoStudent.put(1003 , "Deepesh");
        rollNoStudent.put(1004 , "Jagriti");
        rollNoStudent.put(1005 , "Umesh");

        for(Integer i : rollNoStudent.keySet()){
            System.out.println("Roll No.: "+i+" "+"Name: "+rollNoStudent.get(i));
        }
    }
}
