package Unit3;



import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable<Integer,String> table=new Hashtable<>();

        table.put(1,"Abc");
        table.put(4,"Xyz");
        
       table.put(1,"pq");


        System.out.println("Our Hashtable is: "+table);

       
        // table.put(4,"Laxmi");
        System.out.println(table.putIfAbsent(4, "Laxmi"));
        
    }
}
