//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Car {
    String brand;
    int speed;

    public void drive(){
        System.out.println("The car drives");
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.speed = 80 ;

        car1.drive();

    }
}