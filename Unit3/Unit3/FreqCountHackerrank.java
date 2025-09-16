package Unit3;


import java.util.*;

public class FreqCountHackerrank {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
     Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Map<Character, Integer> mp=new TreeMap<>();
        
        for(char ch: str.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        
        for(Map.Entry<Character,Integer> entry:mp.entrySet()){
            System.out.print(entry.getKey()+" "+entry.getValue()+" ");
        } 
        sc.close();
    }
}
