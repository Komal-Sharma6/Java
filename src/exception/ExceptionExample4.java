package exception;//NullPointerException

public class ExceptionExample4 {
    public static void main(String[] args){
        String name = null;
        try{
            System.out.println(name.length());
        }
        //Multiple catch block

        catch (ArithmeticException e ){
            System.out.println(e);
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Exception Handled");
        }
        System.out.println("All steps executed.");

    }
}
