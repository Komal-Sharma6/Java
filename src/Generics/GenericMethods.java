// Generic methods
package Generics;

public class GenericMethods {

    public static void main(String[] args){

     Integer[] intarray ={1,2,3,4};

     GenericMethods genericMethods = new GenericMethods();
     genericMethods.printArray(intarray);
    }
    public <T> void printArray(T[] array){
        for(T i : array){
            System.out.println(i);

        }
    }
}
