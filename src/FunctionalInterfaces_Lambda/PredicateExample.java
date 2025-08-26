package FunctionalInterfaces_Lambda;


import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> startWithLetterV = x -> x.charAt(0) == 'v';
        Predicate<String> endsWithLetterL = x -> x.charAt(x.length()-1) == 'l';
        Predicate<String> or = startWithLetterV.or(endsWithLetterL);
        Predicate<String> and = startWithLetterV.and(endsWithLetterL);
        System.out.println(or.test("viyan"));
        System.out.println(and.test("viyan"));
        System.out.println(startWithLetterV.negate().test("viyan"));

    }

}
