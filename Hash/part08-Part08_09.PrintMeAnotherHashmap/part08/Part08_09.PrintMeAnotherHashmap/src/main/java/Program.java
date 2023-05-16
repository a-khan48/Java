
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
    public static void printValues(HashMap<String, Book> hashmap2) {
        for(String key: hashmap2.keySet()) {
            System.out.println(hashmap2.get(key));
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap2, String i) {
        for(String key: hashmap2.keySet()){
            if(key.contains(i)) System.out.println(hashmap2.get(key));
        };
    }
}