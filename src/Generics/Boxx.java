//Bounded type parameters

package Generics;

public class Boxx<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
class Main3{
    public static void main(String[] args){
        //This line will show error because of boundation
       // Boxx<String> boxx = new Boxx<>();

        Boxx<Integer> boxx = new Boxx<>();
    }
}
