package chapter17;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {
//        DoubleBinaryOperator a = (double x , double y) -> {return x * y;};
//        DoubleBinaryOperator b = (x, y) -> {return x * y;};
//        DoubleBinaryOperator c = (x, y) ->  x * y;
//         Supplier<String> d = () -> "Welcome to lambdas!";
//        Supplier<ArrayList> e = ArrayList::new;
//        f. button.addActionListener(e -> JOptionPane.showMessageDialog(ParentFrame.this, "JButton event handler"));

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        Stream.of(names).limit(4).forEach(System.out::println);
        Stream.of(names).skip(4).forEach(System.out::println);
        Stream.of(names).max(Comparator.comparing(String::length)).ifPresent(System.out::println);
        Stream.of(names).sorted(Comparator.comparing(String::toLowerCase)).limit(1).forEach(System.out::println);
        Stream.of(names).sorted(String::compareToIgnoreCase).limit(1).forEach(System.out::println);
        System.out.println(Stream.of(names).anyMatch(e -> e.equalsIgnoreCase("Stacy")));;
        System.out.println(Stream.of(names).allMatch(e -> Character.isUpperCase(e.charAt(0))));;
        System.out.println(Stream.of(names).noneMatch(e -> e.substring(0, 2).equalsIgnoreCase("Ko")));
        System.out.println(Stream.of(names).map(String::toLowerCase).collect(Collectors.toList()));
    }
}
