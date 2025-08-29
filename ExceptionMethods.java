public class ExceptionMethods {
        public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        try{
        System.out.println(100/0);
        }

        // catch(Exception e){
        //     System.out.println(e);
        // }
         catch(Exception e){
            System.out.println(e.toString());
        }
        //   catch(Exception e){
        //     e.printStackTrace();
        // }
        //   catch(Exception e){
        //     System.out.println(e.getMessage());
        // }

        finally{
            System.out.println("one");
            System.out.println("two");
            System.out.println("three");
        }
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
    }
}
