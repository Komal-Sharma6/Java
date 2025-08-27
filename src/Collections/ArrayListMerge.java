// Merge two ArrayList into one

package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMerge {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list1 = new ArrayList<>(list);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        System.out.println(list1);



    }
}
