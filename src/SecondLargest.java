import java.util.Scanner;

// print the second largest no. from the array
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }
        int largest = arr[0];
        int secondLargest = arr[1];
        for (int i = 0; i< arr.length; i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest= arr[i];

            }
        }
        System.out.println(largest+" "+secondLargest);
    }

}
