/*Read a student’s percentage (0–100) and print the grade:
90–100 → A
75–89 → B
50–74 → C
Below 50 → Fail
*/

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        if(90<=percentage && percentage<=100){
            System.out.println("A");
        } else if (percentage>=75 && percentage<=89) {
            System.out.println("B");
        } else if (percentage>=50 && percentage<=74) {
            System.out.println("C");
        }else {
            System.out.println("Fail");
        }

    }
}
