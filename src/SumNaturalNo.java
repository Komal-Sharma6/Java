//Sum of First N Natural Numbers
import java.util.*;
public class SumNaturalNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i =1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

}
