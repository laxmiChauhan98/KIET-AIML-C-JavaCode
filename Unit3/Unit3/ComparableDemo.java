package Unit3;



import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    int id;
    int marks;
    String name;

    Employee(int id, String name,int marks) {
        this.id = id;
        this.name = name;
        this.marks=marks;
    }

    // Natural ordering: by id
    @Override
    public int compareTo(Employee e) {
        return this.marks - e.marks;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(3, "A",30));
        list.add(new Employee(1, "B",26));
        list.add(new Employee(2, "C",40));

        Collections.sort(list);  // uses compareTo()
        for(Employee e : list) {
            System.out.println(e.id + " " + e.name+" "+e.marks);
        }
    }
}

