package Unit3;


import java.util.PriorityQueue;


public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //--------Adding elements------
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        System.out.println("Queue is: "+pq);

        //-----adding using offer method-------
        System.out.println("Added using offer: "+pq.offer(25));
        
        //---Remove and print root element---
        System.out.println("Deleted: "+ pq.poll()); // Output: 10
        System.out.println("Deleted: "+pq.poll()); // Output: 20
        

        //---peek method----
        System.out.println("Element on the root: "+pq.peek());  //return top element of the stack


        //--------remove method---------
        System.out.println("Removed: "+pq.remove());

       //-----------clear method-------
        pq.clear();               //all elements will be erased
        System.out.println(pq);


       //pq.remove();   //it will give error if queue is empty and terminate the program
       System.out.println(pq.poll());  //it will return null if queue is empty

        System.out.println("program is running");

        //----empty method-------
        System.out.println(pq.isEmpty());  //return boolean value 

        
    }
}


