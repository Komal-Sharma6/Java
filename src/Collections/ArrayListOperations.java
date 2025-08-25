package Collections;

import java.util.ArrayList;

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

            cars.clear();
        }

    }


