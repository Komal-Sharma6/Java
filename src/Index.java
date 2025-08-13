// Define a method to return the index of the specified element otherwise return -1.
import java.util.*;
public class Index {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int i=0;
        for(; i<arr.length; i++){
            if(arr[i]==element){
                System.out.println(i);
            }

        }
        if(i==arr.length){
            System.out.println("-1");
        }

    }
}
