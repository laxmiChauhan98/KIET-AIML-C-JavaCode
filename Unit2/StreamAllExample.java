

import java.util.*;
import java.util.stream.*;

public class StreamAllExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 4, 6);

        System.out.println("Original List: " + numbers);

        //  filter() → keep only even numbers
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evens);

        // map() → square each number
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // sorted() → sort ascending
        List<Integer> sorted = numbers.stream()
                                      .sorted()   //(a,b)->(b-a)
                                      .collect(Collectors.toList());
        System.out.println("Sorted List: " + sorted);

        // distinct() → remove duplicates
        List<Integer> distinct = Arrays.asList(1, 2, 2, 3, 3, 3, 4).stream()
                                      .distinct()
                                      .collect(Collectors.toList());
        System.out.println("Distinct List: " + distinct);

        //  forEach() → print all
        System.out.print("Print using forEach: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        //  count() → total number of elements
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // reduce() → sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum using reduce: " + sum);

        //  anyMatch(), allMatch(), noneMatch()
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Any Even? " + anyEven);
        System.out.println("All Positive? " + allPositive);
        System.out.println("None Negative? " + noneNegative);

        //  limit() and skip()
        List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
        List<Integer> skipped = numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println("First 3 Numbers (limit): " + limited);
        System.out.println("After Skipping 3 Numbers (skip): " + skipped);

        // collect() to Set
        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
        System.out.println("Collected as Set: " + numberSet);
    }
}

