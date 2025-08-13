//Read an integer and print its digits in reverse order.
import java.util.*;
public class ReverseNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String reverse ="";
        while(n>0){
            int a =n%10;
            reverse+=a;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
