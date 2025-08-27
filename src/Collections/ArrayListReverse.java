//Reverse the element of ArrayList

package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListReverse {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1,7,6,2,9,0);
        Integer[] array = new Integer[numbers.size()];
        for(int i=0; i<numbers.size(); i++){
            array[i]=numbers.get(numbers.size()-1-i);

        }
        for (Integer i : array){
            System.out.println(i);
        }

    }

}
