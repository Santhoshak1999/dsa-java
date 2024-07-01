package HashMap;
import java.util.*;
import java.util.Map.Entry;
public class Exercise_One {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "Red");
        hashmap.put(2, "Greed");
        hashmap.put(3, "White");
        hashmap.put(3, "Yellow");
        hashmap.put(5, "Black");
        hashmap.put(7, "Chacolet");

        // Map.Entry is an interface in the Java Collections Framework.
        // It represents a key-value pair in a Map.
        // Each entry in the Map is an instance of Map.Entry.
        //Syntax
        // Map.Entry<KeyType, ValueType>

        for(Map.Entry<Integer, String> x : hashmap.entrySet()){
            System.out.println(x.getKey() + "  " + x.getValue());

        }

    }
    
}
