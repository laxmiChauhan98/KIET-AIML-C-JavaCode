

import java.util.Scanner;

@FunctionalInterface
interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lambda expression to check if a number is even
        NumericTest isEven = (n) -> (n % 2) == 0;

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven.test(num))
            System.out.println(num + " is even");
        else
            System.out.println(num + " is not even");

      
    }
}

