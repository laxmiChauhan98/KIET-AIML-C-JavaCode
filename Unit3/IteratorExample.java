package Unit3;
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Amit");
        employees.add("Neha");
        employees.add("Shikha");

        Iterator<String> it = employees.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
