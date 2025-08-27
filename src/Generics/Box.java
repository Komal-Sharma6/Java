package Generics;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

class Main{
    public static void main(String[] args){
        Box<Integer> box= new Box<>();//Box is now type safe.
        box.setValue(1);
     int i =box.getValue();
        System.out.println(i);
    }
}
