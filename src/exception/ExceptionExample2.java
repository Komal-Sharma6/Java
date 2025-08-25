package exception;

//ArrayIndexOutOfBoundsException
public class ExceptionExample2 {
    public static void main(String[] args){
        int[] numerator = {50,80,30,100};
        int[] denominator = {5,2,3,10};
        for(int i =0; i<10; i++){
            try {
                System.out.println(numerator[i]/denominator[i]);
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("Exception Handled!");
            }

        }
        System.out.println("All steps executed.");
    }

}
