package Unit3;


import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> aiml=new HashMap<>();

        //Adding the Values
        aiml.put(1, "Akash");
        aiml.put(2, "Astha");
        aiml.put(6, "Shreya");
        aiml.put(4, "barkha");
        aiml.put(13,"charlie");
       
       
        //Printing the values
        System.out.println(aiml);
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
