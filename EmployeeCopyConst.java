public class EmployeeCopyConst {
    int id;
    String name;

    // Normal Constructor
    EmployeeCopyConst(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Shallow Copy Constructor
    EmployeeCopyConst(EmployeeCopyConst e) {
        this.id = e.id;
        this.name = e.name; // same reference
    }

    // Deep Copy Constructor
    EmployeeCopyConst(EmployeeCopyConst e, boolean deepCopy) {
        this.id = e.id;
        this.name = new String(e.name); // new copy of string
    }

    void show(String msg) {
        System.out.println(msg + " -> ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        EmployeeCopyConst e1 = new EmployeeCopyConst(101, "Laxmi");

        EmployeeCopyConst e2 = new EmployeeCopyConst(e1);          // Shallow copy
        EmployeeCopyConst e3 = new EmployeeCopyConst(e1, true);    // Deep copy

        System.out.println("Before Changes:");
        e1.show("Original");
        e2.show("Shallow Copy");
        e3.show("Deep Copy");

        // change original object
        e1.id = 999;
        e1.name = "Shubhi";

        System.out.println("\nAfter Changes in Original:");
        e1.show("Original");
        e2.show("Shallow Copy"); // affected
        e3.show("Deep Copy");    // safe
    }
}













// public class EmployeeCopyConst {
//     int id;
//     String name;

//     // Normal Constructor
//     EmployeeCopyConst(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     // 🔸 Shallow Copy Constructor (same reference for name)
//     EmployeeCopyConst(EmployeeCopyConst e1) {
//         this.id = e1.id;
//         this.name = e1.name;  // points to same String object
//     }

//     // 🔹 Deep Copy Constructor (new object banaya)
//     EmployeeCopyConst(EmployeeCopyConst e, boolean deepCopy) {
//         this.id = e.id;
//         this.name = new String(e.name); // fresh string object
//     }

//     void showDetails(String msg) {
//         System.out.println(msg + " -> ID: " + id + ", Name: " + name);
//     }


//     public static void main(String[] args) {
//       EmployeeCopyConst e1 = new EmployeeCopyConst(101, "Laxmi");

//         // Shallow copy
//         EmployeeCopyConst e2 = new EmployeeCopyConst(e1);

//         // Deep copy
//         EmployeeCopyConst e3 = new EmployeeCopyConst(e1, true);

//         System.out.println("--------Before Changes:----------");
//         e1.showDetails("Original");
//         e2.showDetails("Shallow Copy");
//         e3.showDetails("Deep Copy");

//         System.out.println("\n--- After changing e1 ka name ---");
//         e1.id=11111;
//         e1.name = "Shubhi";

//         e1.showDetails("Original");
//         e2.showDetails("Shallow Copy:"); // Affected because same reference
//         e3.showDetails("Deep Copy:");    // Not affected
// }
// }
