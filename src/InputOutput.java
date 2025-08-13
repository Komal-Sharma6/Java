import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];

        for (int i =0; i< arr.length; i++){
            int sum=0;
            int a;
            while(arr[i]>0){
                a = arr[i]%10;
                sum+=a;
                arr[i]=arr[i]/10;
            }
            arr2[i]=sum;
        }
        for(int i=0;i< arr2.length; i++){
            System.out.println(arr2[i]);
        }


    }
}



