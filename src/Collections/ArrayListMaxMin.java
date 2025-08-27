//Find max and min fron the arraylist of integers
package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaxMin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(22);
        list.add(99);

        Integer[] array = list.toArray(new Integer[0]);
        int max = array[0];
        int min = array[array.length-1];

        for(int i =0 ;i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Max= "+max+" Min= "+min);



    }
}