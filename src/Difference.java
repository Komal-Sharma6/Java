import java.util.Scanner;

// To define a method to return difference of the smallest & biggest element of integer array
public class Difference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int biggest = arr[0];
        int smallest = arr[n-1];
        for(int i= 0; i<arr.length; i++){
            if(arr[i]>=biggest){
                biggest=arr[i];
            }
            if(arr[i]<=smallest){
                smallest=arr[i];
            }


        }
        System.out.println(biggest-smallest);
    }

}
