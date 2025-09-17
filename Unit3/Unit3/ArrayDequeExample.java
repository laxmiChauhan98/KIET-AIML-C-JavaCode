package Unit3;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        // Create an ArrayDeque of Strings
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements 
        deque.add("A");
        deque.addFirst("F");
        deque.addLast("L"); 

        // Add using Offer
        deque.offer("C");   // Adds at the end safely
        deque.offerFirst("First");
        deque.offerLast("Last");


        System.out.println("After adding elements:"+deque);
         // Shows the current deque


        // Access elements 
        System.out.println("First element (peek): " + deque.peek()); // same as peekFirst()
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());
        

        // Remove elements 
        System.out.println("\nRemoving elements:");
        System.out.println("Removed first (removeFirst): " + deque.removeFirst());
        System.out.println("Removed last (removeLast): " + deque.removeLast());
        System.out.println("Removed first (pollFirst): " + deque.pollFirst());
        System.out.println("Removed last (pollLast): " + deque.pollLast());

        System.out.println("Deque after removals:");
        System.out.println(deque);

        // Check if empty
        System.out.println("\nIs the deque empty? " + deque.isEmpty());

        // Clear the deque
        deque.clear();
       
        System.out.println("Deque after clear:");
        System.out.println(deque);

        System.out.println("Is the deque empty now? " + deque.isEmpty());
    }
}










