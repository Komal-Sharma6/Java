package exception;

public class ExceptionExample1 {

public static void main (String[] args){
    int[] numerator = {100,60,30,40};
    int[] denominator ={10,3,0,4};
    for(int i=0; i<numerator.length; i++){
        try {
            System.out.println(numerator[i] / denominator[i]);
        }
        // AirthmeticException
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception Handled");

        }
    }

    System.out.println("All steps int the code executed");
}

}
