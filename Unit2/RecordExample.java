public class RecordExample {

    record Person(String name, int age) { }

    public static void main(String[] args) {

        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        Person p3 = new Person("Alice", 25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("p1 == p3 ? " + p1.equals(p3));
    }
}
