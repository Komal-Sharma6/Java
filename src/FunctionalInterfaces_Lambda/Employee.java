//Usage of lambda expression

package FunctionalInterfaces_Lambda;

public interface Employee {
    String getName();


}

class Main {
    public static void main(String[] args) {
        Employee employee1 = () -> "Software Engineer";
        System.out.println(employee1.getName());
    }
}