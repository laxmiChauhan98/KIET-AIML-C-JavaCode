


import java.util.*;

//default method, Static Method, For Each Method, Try-with-resources

// Interface with Default and Static methods
interface MyInterface {
    void show(); // abstract method

    // Default Method
    default void defaultMethod() {
        System.out.println("This is a Default Method (can be overridden).");
    }

    //Static Method
    static void staticMethod() {
        System.out.println("This is a Static Method (called using Interface name).");
    }
}

// Class implementing interface
class MyClass implements MyInterface {
    public void show() {
        System.out.println("This is Abstract Method implemented in class.");
    }
}

public class Java8FeaturesDemo {
    public static void main(String[] args) {

        // Interface methods demo
        MyClass obj = new MyClass();
        obj.show();                // abstract method
        obj.defaultMethod();       // default method
        MyInterface.staticMethod();// static method

        // forEach() Method (used with Collection)
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        System.out.println("forEach Output: ");
        for(int s:numbers)
        {
            System.out.println(s);
        }
        numbers.forEach(n -> System.out.print(n + " ")); // Lambda Expression
        



        //  Try-with-Resources (Auto close resource)
        System.out.println("\nTry-with-Resources Example:");
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter some words:");
        while (sc.hasNext()) {
        String word = sc.next();
        System.out.println("You typed: " + word);
    }
}
 // no need of sc.close()
    }
}
