import java.util.Scanner;

// To read n words from user and print highest length word
public class HighestLengthWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.next();
        }
        String highest = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i].length()>highest.length()){
                highest= arr[i];
            }
        }
        System.out.println(highest);
    }
}
