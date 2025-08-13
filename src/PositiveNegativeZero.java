/*Write a program to read an integer and print:

        "Positive" if it’s greater than 0

        "Negative" if it’s less than 0

        "Zero" if it’s exactly 0 */


import java.util.*;
public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        } else if (n==0) {
            System.out.println("Zero");
        }
    }
}
