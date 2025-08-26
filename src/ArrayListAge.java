import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListAge {
    public static void main(String[] args) {

        Student student1 = new Student(12, "Diya");
        Student student2 = new Student(21, "Shyam");
        Student student3 = new Student(15, "Jiya");
        Student student4 = new Student(19, "UV");

        ArrayList<Student> age = new ArrayList<>();
        age.add(student1);
        age.add(student2);
        age.add(student3);
        age.add(student4);

        ArrayList<Student> ageAbove18 = new ArrayList<>();

        for (Student i : age) {
            if (i.age > 18) {
                ageAbove18.add(i);
            }
        }

        for (Student a : ageAbove18) {
            System.out.println(a.name);
            System.out.println(a.age);
        }
    }


    //     }


    static class Student {
        int age;
        String name;

        Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}