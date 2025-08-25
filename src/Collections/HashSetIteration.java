package Collections;

import java.util.HashSet;

public class HashSetIteration {
    public static void main(String[] args){
        HashSet<Integer> age = new HashSet<>();
        age.add(45);
        age.add(21);
        age.add(23);
        age.add(76);
        age.add(20);

        for (int i=0;i<77;i++){
            if(age.contains(i)){
                System.out.println(i);
            }

        }
    }
}
