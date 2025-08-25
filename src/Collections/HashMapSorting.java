package Collections;

import java.util.HashMap;
import java.util.Map;
public class HashMapSorting {
    public static void main(String  [] args){
      HashMap<Integer, String> student = new HashMap<>();
      student.put(23,"Harsh");
      student.put(43,"Priya");
      student.put(98,"Sonam");
      student.put(14,"Anuj");
        int j =0;
        int [] arr = new int[student.size()];
       for (Map.Entry<Integer,String> e:student.entrySet() ){
           for(Integer i:student.keySet()){
               while(j< student.size())
               arr[j] = i;
               j++;
           }
       }
       for(int i =0 ; i< student.size(); i++){
           System.out.println(arr[i]);
        }
    }
}
