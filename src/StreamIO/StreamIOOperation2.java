package StreamIO;


import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamIOOperation2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(12,17,41,60,22,11);

        List<Integer> afterOperations = numbers.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(3)
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(afterOperations);

    }
}
