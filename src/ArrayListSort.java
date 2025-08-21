import java.util.*;
public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Android");
        books.add("Java");
        books.add("ASP.NET");
        books.add("Data Structure");
        books.add("Artificial Intelligence");

        Collections.sort(books);
        for(String i : books){
            System.out.println(i);
        }

        ArrayList<Integer> squares = new ArrayList<Integer>();
        squares.add(4);
        squares.add(81);
        squares.add(64);
        squares.add(9);
        squares.add(25);

        Collections.sort(squares);

        for(Integer i : squares){
            System.out.println(i);
        }




    }
}