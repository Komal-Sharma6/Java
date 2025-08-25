import java.util.Scanner;

// throws keyword usage
public class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }

}
class Voting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible to vote.");
            } else {
                System.out.println("Proceed to vote!");
            }
        }
        catch (YoungerAgeException e){
            e.printStackTrace();
        }
        System.out.println("All steps executed");
    }
}
