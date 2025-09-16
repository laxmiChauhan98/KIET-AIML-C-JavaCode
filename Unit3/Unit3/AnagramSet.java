package Unit3;

import java.util.*;

public class AnagramSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Convert strings to sets of characters
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();

        for (char ch : str1.toCharArray()) set1.add(ch);
        for (char ch : str2.toCharArray()) set2.add(ch);

        // Compare sets
        if (set1.equals(set2)) {
            System.out.println("Anagram (unique chars)");
        } else {
            System.out.println("Not an Anagram");
        }
        sc.close();
    }
    
}

