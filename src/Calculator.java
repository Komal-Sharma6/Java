import java.util.Scanner;

/*Read two numbers and an operator (+, -, *, /).
Use a switch statement to perform the operation and print the result.
*/
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String operator = sc.next();
        switch (operator){
            case "+":
            System.out.println(n1+n2);
            break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                break;


        }

    }
}
