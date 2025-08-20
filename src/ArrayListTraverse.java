import java.util.*;
public class ArrayListTraverse {
    public static void main (String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Custard Apple");

        for(int i=0; i<5; i++){
            System.out.println(fruits.get(i));
        }
    }

}
