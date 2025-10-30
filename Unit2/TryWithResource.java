import java.util.Scanner;

public class TryWithResource{
    public static void main(String[] args) {


        
        // try-with-resources: Scanner will close automatically
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Hello " + name + ", you are " + age + " years old!");
        }  // Scanner automatically closed here

    }
}
