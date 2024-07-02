package HashMap;
import java.util.HashMap;
import java.util.Map;

public class MapContainsEmptyCheck {
    public static void main(String[] args){
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "green");
        hashmap.put(2, "Black");

        //print original linked map
        System.out.println(hashmap);
        boolean result = hashmap.isEmpty();
        System.out.println(result);
        System.out.println();
        hashmap.clear();
        result = hashmap.isEmpty();
        System.out.println(hashmap);
        System.out.println(result);




    }
    
}
