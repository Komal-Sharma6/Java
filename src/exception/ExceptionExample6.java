package exception;

public class ExceptionExample6 {
    public static void main(String[] args){
        int a=100,b=0,c;
        try{
            c=a/b;
        } catch (Exception e) {
           System.out.println(e);
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
