package Unit3;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> aiml=new HashMap<>();

       
        //Adding the Values
        aiml.put(1, "Akash");
        aiml.put(2, "Astha");
        aiml.put(6, "Shreya");
        aiml.put(7, "Varun");
        aiml.put(5,"Shreya");
        
        aiml.put(3, null);
        aiml.put(4, null);
        aiml.put(null, "Laxmi");

          //Printing the values
        System.out.println(aiml);


        System.out.println("Map elements with for-each loop");

          System.out.println("Traversing via key");
         for (Integer k : aiml.keySet()) {
            System.out.println(k + " " + aiml.get(k));
        }

        System.out.println("Traversing via entry");
        for (Map.Entry<Integer, String> entry : aiml.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }   
        System.out.println("Traversing via iterator");
         Iterator<Map.Entry<Integer, String>> itr = aiml.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



        System.out.println("All Keys: "+aiml.keySet());
        System.out.println("All values: "+aiml.values());
        System.out.println("Key-value pairs: "+aiml.entrySet());

        //getting value of particular key
        System.out.println( "Value of key: "+aiml.get(10));
        System.out.println(aiml.getOrDefault(3, "Unknown"));
      

        //adding duplicates
        aiml.put(10,"Shikha");
        System.out.println(aiml);

        aiml.put(11,null);
        System.out.println("After adding null: "+aiml);
    
        HashMap<String,Integer> hsm=new HashMap<>();
        hsm.put("Laxmi", 26);
        hsm.put("Shikha",20);
        hsm.put("Raghav", 25);
        System.out.println(hsm);

         
    }
}
