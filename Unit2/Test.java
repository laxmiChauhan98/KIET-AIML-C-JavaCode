sealed class Human permits Anjali, Neha, Vartika {
    void speak() {
        System.out.println("Human Speaking");
    }
}

final class Anjali extends Human { }

final class Neha extends Human { }

non-sealed class Vartika extends Human { }

public class Test {
    public static void main(String[] args) {
        Human h = new Anjali();
        h.speak();
    }
}

