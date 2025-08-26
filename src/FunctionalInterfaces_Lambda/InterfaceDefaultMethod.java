package FunctionalInterfaces_Lambda;

interface Parent{
    //Method with implementation are called Default Methods
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child1 implements Parent{

    @Override
 public void sayHello(){
    System.out.println("Bye");
}
}

public class InterfaceDefaultMethod {
    public static void main(String[] args){
        Child1 child1 = new Child1();
        child1.sayHello(); //We are able to access method because it is default method otherwise we would have to provide implementation first in child class.

        Parent parent = new Child1();
        parent.sayHello();



    }
}
