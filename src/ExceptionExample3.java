//FileNotFoundException
//Checked Exception

import java.io.FileInputStream;

public class ExceptionExample3 {
    public static void main(String [] args){
        try{
            FileInputStream fis = new FileInputStream("abc.txt");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("All steps executed.");

    }
}
