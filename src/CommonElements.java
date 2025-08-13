import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {4,8,9,3};
        int[] arr2 = {5,8,7,4,2};
        for (int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
