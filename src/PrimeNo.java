// To read n integer from user and print prime no. from it
import java.util.*;
public class PrimeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=1)
                continue;
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(arr[i]); j++){
                if(arr[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(arr[i]);
            }
        }

            }

        }




