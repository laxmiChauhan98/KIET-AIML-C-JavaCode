public class OperatorDemo {
    public static void main(String[] args) {
        
        // '+' overloaded for numbers
        int a = 10, b = 10;
        System.out.println("Sum: " + (a + b));   // addition

        // '+' overloaded for Strings
        String s1 = "Hello";
        String s2 = "KIET";
        String s3= s1 +" "+ s2;
        System.out.println("Concatenation: " +s3);  // concatenation

      
    }
}
