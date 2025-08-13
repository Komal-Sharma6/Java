// To define a method to return the average of integer elements
import java.util.*;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        int avg= sum/arr.length;
        System.out.println(avg);
    }
}
