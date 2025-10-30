

import java.util.function.Function;

// interface Function<T, R> {
//     R apply(T t);
// }
public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5)); // 25
        System.out.println(square.apply(9)); // 81
    }
}

