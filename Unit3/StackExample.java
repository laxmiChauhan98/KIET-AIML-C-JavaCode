package Unit3;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        //push, pop, empty, peek, search

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        System.out.println(st);

        System.out.println("Size is:" +st.size());
        System.out.println("Capacity is:"+st.capacity());

        st.push(11);
        System.out.println(st);
        System.out.println("Size is:" +st.size());
        System.out.println("Capacity is:"+st.capacity());
        
        System.out.println("Element deleted: "+st.pop());

        System.out.println("Is stack empty? "+st.empty());
        System.out.println("Element at the top is: "+st.peek());


        System.out.println("Index is:"+st.search(2)); 
    }
}
