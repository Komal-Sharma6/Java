//throws keyword usage

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWrite {
    void read() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc.txt");
    }
    void wite() throws FileNotFoundException{
        String input ="Write something";
        FileOutputStream fos = new FileOutputStream("xyz.txt");
    }
}
class Test{
    public static void main(String[] args){
        ReadWrite rw = new ReadWrite();
        try {
            rw.read();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            rw.wite();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("All STEPS EXECUTED");

    }
}
