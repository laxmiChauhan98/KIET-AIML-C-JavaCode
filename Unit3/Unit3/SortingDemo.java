package Unit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>(); 

        al.add(22);
        al.add(51);
        al.add(14);
        al.add(36);
       
        System.out.println("Arraylist is: "+al);

          Collections.sort(al);
          System.out.println("After sorting Arraylist is: "+al);


          Integer []array={2,5,1,4,8,3};
          System.out.println("Array is: "+Arrays.toString(array));

          Arrays.sort(array);
          System.out.println("after sorting Array is: "+Arrays.toString(array));


          Collections.sort(al, Comparator.reverseOrder());
          System.out.println("After reverse sorting Arraylist is: "+al);

         
          Arrays.sort(array, Comparator.reverseOrder());
          System.out.println("after sorting Array is: "+Arrays.toString(array));

          Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
               if(i%10>j%10){
                return 1;
               }
               else{
                return -1;
               }
                
            }
          };
          Collections.sort(al, comp);
          System.out.println("Sorted in customized order: "+al);
        

        //   String str1="School";
        //   String str2="Scale";

        //  int index=str1.compareTo(str2);
        //  if(index>0){
        //     System.out.println("Str1 comes after str2");
        //  }
        //  if(index<0){
        //     System.out.println("str1 comes before str2");
        //  }
        //  if(index==0){
        //     System.out.println("both strings are equal");
        //  }
         
    }    
}
