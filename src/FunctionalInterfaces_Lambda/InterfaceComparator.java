//Comparator
package FunctionalInterfaces_Lambda;

import java.util.*;

public class InterfaceComparator {
    public static void main(String[] args){
        List<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(34);
        number.add(76);
        number.add(9);
        number.add(1);

        Collections.sort(number,(a,b)->b-a);
        System.out.println(number);

        Set<Integer> ss = new TreeSet<>();
        ss.add(13);
        ss.add(98);
        ss.add(95);
        ss.add(32);
        ss.add(12);
        System.out.println(ss);
        Set<Integer> ss1 = new TreeSet<>((a,b)-> b-a);
        ss1.add(19);
        ss1.add(9);
        ss1.add(5);
        System.out.println(ss1);





    }
}
