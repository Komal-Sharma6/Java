//Anonymous inner class.

package FunctionalInterfaces_Lambda;

public interface Employee1 {
    String getSalary();
    String getDesignation();
}

class Main2{
public static void main(String[] args){
    Employee1 employee = new Employee1()
    //Anonymous inner class
    {
        @Override
        public String getSalary() {
            return "100";
        }

        @Override
        public String getDesignation() {
            return "Software Engineer";

        }
    };
    System.out.println(employee.getSalary());
    System.out.println(employee.getDesignation());
}
}
