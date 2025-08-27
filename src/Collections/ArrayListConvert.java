package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Gita", "Sita","Babita");
        String[] array = list.toArray(new String[0]);
        for(String i : array){
            System.out.println(i);
        }
    }
}
