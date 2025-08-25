package Collections;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args){
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(4);
        numbers.add(8);
        numbers.add(97);
        numbers.add(2434);
        numbers.add(56);

        //Adds element to the begining of the list
        numbers.addFirst(7);

        //Adds element to the end of list
        numbers.addLast(4);

        //Remove an element from the begining of the list
        numbers.removeFirst();

        //Remove an element from the end of the list
        numbers.removeLast();

        //Get the element the beginning of the list
        System.out.println(numbers.getFirst());

        //Get the element from the end of the list
       System.out.println(numbers.getLast());

        System.out.println(numbers);

    }
}
