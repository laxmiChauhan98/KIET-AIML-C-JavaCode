import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface NonNull {}

public class TypeAnnotationExample {
    public static void main(String[] args) {
        // Type annotation used before a variable type
        @NonNull String name="Laxmi";

        System.out.println(name);
    }
}
