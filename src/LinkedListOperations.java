import java.util.*;
public class LinkedListOperations {
    public static void main(String[] args){
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(4);
        numbers.add(8);
        numbers.add(97);
        numbers.add(2434);
        numbers.add(56);

        //
        numbers.addFirst(7);

        System.out.println(numbers);

    }
}
