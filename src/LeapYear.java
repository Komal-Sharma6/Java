/*Read a year and print "Leap Year" if it’s divisible by 4 but not by 100, or divisible by 400.
Otherwise, print "Not a Leap Year".*/
import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
