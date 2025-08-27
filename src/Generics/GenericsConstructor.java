//Just making generic

package Generics;

public class GenericsConstructor {


    public <T extends  Number> void GenericConstructor(T value){

    }


}
class Test1{
    public static void main(String[] args){
      GenericsConstructor genericsConstructor = new GenericsConstructor();
    }
}

