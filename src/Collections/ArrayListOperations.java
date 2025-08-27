package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOperations {

        public static void main(String[] args){
            ArrayList<String> cars = new ArrayList<>();

            // adds element at the end of the list
            cars.add("Honda");
            cars.add("Volvo");
            cars.add("Hundai");
            cars.add("Mercedes");

             System.out.println(cars);

            // adds element at the specified index

            cars.add(0,"Bugati");
            cars.add(2,"BMW");

            System.out.println(cars);

            // Access elements

            System.out.println(cars.get(4));

            // Change element

            cars.set(4,"Farrai");
            System.out.println(cars);

            // Remove element

            cars.remove(4);
            System.out.println(cars);

            // Size of ArrayList

            System.out.println(cars.size());

            // To remove all the elements

           // cars.clear();

            List<Integer> list = Arrays.asList(1,2,3,4);
            //add or remove operation cannot be performed as , asList method returns fixed
            //list.add(5);

            //To add element to "list"
            List<Integer> list2 = new ArrayList<>(list);
            list2.add(5);

            //To replace element
            list2.set(2,0);

            System.out.println(list2);

            //addALL operation
            List<String> list3 = List.of("Aarya","Prachi","Jaya","Himanshu");
            List<String> list4 = new ArrayList<>();
            list4.add("Bhanu");
            list4.add("Vayu");
            list4.add("Jaggu");
            list4.addAll(list3);
            System.out.println(list4);

            //To covert list into a array
            Integer[] array = list4.toArray(new Integer[0]);


        }

    }


