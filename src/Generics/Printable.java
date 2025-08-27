//Bounded Type Parameters

package Generics;

public interface Printable {
    void print();
}


 class MyNumber extends Number implements Printable{

    private final int value;

    public MyNumber(int value){
        this.value=value;
    }

     @Override
     public void print() {
     System.out.println(value);
     }

     @Override
     public int intValue() {
         return value;
     }

     @Override
     public long longValue() {
         return value;
     }

     @Override
     public float floatValue() {
         return value;
     }

     @Override
     public double doubleValue() {
         return value;
     }


     }
 class Box1<T extends Number & Printable>{
    private T item;

    public Box1(T item){
        this.item=item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }
 }




 class Test{
    public static void main(String[] args){
        MyNumber myNumber =new MyNumber(12);
        Box1<MyNumber> box1 = new Box1<>(myNumber);
        box1.display();
    }
 }
