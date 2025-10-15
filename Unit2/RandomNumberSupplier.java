package Unit2;

import java.util.function.Supplier;
import java.util.Random;

// interface Supplier<T> {
//     T get();
// }

public class RandomNumberSupplier {
    public static void main(String[] args) {
        Random random = new Random();
        
        Supplier<Integer> rn = () -> random.nextInt(100); // 0 to 99
        
        System.out.println("Random number: " + rn.get());
        System.out.println("Another random number: " + rn.get());
    }
}

