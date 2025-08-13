import java.util.Scanner;

// move all the zero in the array towards end ex: input:[0,1,0,3,12] output: [1,3,12,0,0]
public class MoveZeroTowardEnd {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = sc.nextInt();
//        }

        int arr1[] = {5,0,2,0,1,6,7};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
              for(int j=i+1; j<arr1.length; j++ ){
                  arr1[j-1]=arr1[j];
              }
              arr1[arr1.length-1]=0;
            }

        }
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}

