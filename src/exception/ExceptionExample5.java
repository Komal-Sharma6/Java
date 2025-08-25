package exception;//Different way of printing Exception

public class ExceptionExample5 {
    public static void main(String [] args){
        int a=100, b=0, c;
        try{
            c=a/b;
        }
        catch (Exception e){
            // Prints Description and Name doesn't print "StackTrace"
            System.out.println(e);
            System.out.println(e.toString());

            //Prints Description just
            System.out.println(e.getMessage());

            //Prints Description, Name, StackTrace
            e.printStackTrace();
        }

    }
}
