package Unit3;
import java.util.*;

public class UniqueWordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many words will you enter?");
        int N = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> freqMap = new HashMap<>();
        HashSet<String> uniqueWords = new HashSet<>();

        // Process sentences
        for (int i = 0; i < N; i++) {
            String[] words = sc.nextLine().split(" ");
            for (String w : words) {
                uniqueWords.add(w);
                freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
            }
        }

        int Q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Q; i++) {
            String[] query = sc.nextLine().split(" ");

            switch (query[0]) {
                case "COUNT_UNIQUE":
                    System.out.println(uniqueWords.size());
                    break;
                case "FREQUENCY":
                    System.out.println(freqMap.getOrDefault(query[1], 0));
                    break;
                case "PRINT_SORTED":
                    ArrayList<String> list = new ArrayList<>(uniqueWords);
                    Collections.sort(list);
                    for (String w : list) {
                        System.out.print(w + " ");
                    }
                    System.out.println();
                    break;
            }
        }
        
      

  sc.close();
    }
}
