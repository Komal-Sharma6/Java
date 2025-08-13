import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] reverse = new int[n];
        for (int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i< arr.length; i++){
            reverse[i]=arr[arr.length-1-i];

        }
        for(int i=0; i< reverse.length; i++){
            System.out.println(reverse[i]);

        }
    }
}
