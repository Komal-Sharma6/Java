package FunctionalInterfaces_Lambda;

import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Dhanashree"));

        Function<String,String> function1 = x-> x.substring(0,2);
        System.out.println(function1.apply("Jagriti"));
    }
}