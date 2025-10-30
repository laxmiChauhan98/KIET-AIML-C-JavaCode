import java.util.Arrays;
import java.util.List;

class StudentDemo{

    StudentDemo(int n){
        System.out.println("For id "+n+" student is created");
    }

    // public static void showDetails(int n){  //static method
    //     System.out.println(n);
    // }
    
    public void print(int n){   //non-static method
        System.out.println(n);
    }
}
public class MethodReference {
    public static void main(String[] args) {
        List <Integer> IDs=Arrays.asList(1,2,3,4,5);


         //calling constructor using method reference

         IDs.forEach(StudentDemo::new);

        // //using lambda expression
        // IDs.forEach(n->System.out.println(n));

        //using method reference
        // IDs.forEach(StudentDemo::showDetails);

        // StudentDemo sd=new StudentDemo();
        // IDs.forEach(sd::print);

       
    }
    
}
