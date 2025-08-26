package FunctionalInterfaces_Lambda;

@FunctionalInterface
public interface MyInterface {

    //Abstract method
    void write();

     private void read(){
     System.out.println("Hello");
     }
    static void listen(){

    }
    default void  speak(){
     System.out.println("Hello");
    }
}

//Inheritance concept

@FunctionalInterface
interface Child extends MyInterface{

// static method
static void play(){

}
// Parent class static method declared again
static void listen(){

}
//void run(); // Not allowed as child will have two abstract method then.


//Parent abstract method declared again
void write();

}


