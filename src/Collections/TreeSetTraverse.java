package Collections;

import java.util.TreeSet;

public class TreeSetTraverse {
    public static void main(String[] args){
        TreeSet<Integer> rollNo = new TreeSet<>();
        rollNo.add(76);
        rollNo.add(54);
        rollNo.add(2);
        rollNo.add(31);
        rollNo.add(76);

        for( Integer i:rollNo) {
            System.out.println(i);
        }


    }

}
