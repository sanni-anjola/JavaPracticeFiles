package chapter17;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntRangeSum {
    public static void main(String[] args) {
        IntStream range = IntStream.rangeClosed(1, 10);
//        OptionalInt prod = range.reduce((accumulator, element) -> accumulator *= element);
//        if(prod.isPresent()) System.out.println(prod.getAsInt());
//        System.out.println(prod);
//        System.out.println(Arrays.toString(range.toArray()));
//        System.out.println(range.map(item -> item * 2).sum());
//        int[] map = range.map(item -> item * 2).toArray();
//        System.out.println(Arrays.toString(map));


//        int total = 0;
//        for (int i = 0; i <= 20 ; i += 2) {
//            total += i;
//        }
//        System.out.println(total);

//        int total = IntStream.rangeClosed(1, 10)
//                             .filter(x -> x % 2 == 0)
//                             .map(x -> x * 3)
//                             .sum();
//        System.out.println(total);
//        SecureRandom randomNumbers = new SecureRandom();
//        String numbers = randomNumbers.ints(10, 1, 7)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining());

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        System.out.println("Original values: ");
        System.out.println(IntStream.of(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));

        System.out.println(IntStream.of(values).max().getAsInt());
        System.out.println(IntStream.of(values).min().getAsInt());
        System.out.println(IntStream.of(values).sum());
        System.out.println(IntStream.of(values).count());
        System.out.println(IntStream.of(values).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println("reduce: " + IntStream.of(values).reduce(0, Integer::sum));
        System.out.println(IntStream.of(values).summaryStatistics());
        System.out.println(IntStream.of(values).reduce(0, (memo, item) -> memo += item * item));
        System.out.println(IntStream.of(3,1,2).reduce(0, (memo, item) -> memo += item * item));
//        System.out.println(IntStream.of(values).average().getAsDouble());

    }
}
