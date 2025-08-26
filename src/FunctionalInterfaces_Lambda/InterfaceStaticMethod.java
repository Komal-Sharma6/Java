package FunctionalInterfaces_Lambda;

public interface InterfaceStaticMethod {
    static void sayHello(){
        System.out.println("Hello!");
    }
    default void sayBye(){
        System.out.println("Bye!");
    }
}

class Child3 implements InterfaceStaticMethod{
    public static void main(String[] args){
        Child3 child3 = new Child3();
        //Static method can not be called by implementing class object or name.
       /* child3.sayHello();
        Child3.sayHello();*/

        //Static method can only be called by the name of the interface class which is being implemented
        InterfaceStaticMethod.sayHello();

        //Default method can be called
        child3.sayBye();
    }

}
