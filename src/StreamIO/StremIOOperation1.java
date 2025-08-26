package StreamIO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremIOOperation1 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(18,3,17,19,14,11,21);
        List<Integer> ageAbove18 = numbers.stream().filter(x->x>18).collect(Collectors.toList());
        System.out.println(ageAbove18);
    }

}
