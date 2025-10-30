

import java.util.*;
import java.util.stream.*;

public class StreamAllInOne {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 4, 6, 2, 3);

        // Stream operations combined
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)       // keep even numbers
                .distinct()                    // remove duplicates
                .sorted()                      // sort ascending
                .map(n -> n * n)               // square each number
                .skip(1)                       // skip first
                .limit(3)                      // take next 3
                .collect(Collectors.toList()); // collect result

        // print final list using forEach
        System.out.print("Final Result: "+result);
        

        // reduce() example (sum of all)
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("\nSum of all numbers: " + sum);
    }
}

