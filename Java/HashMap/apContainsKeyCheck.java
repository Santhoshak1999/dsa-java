package HashMap;
import java.util.*;
public class apContainsKeyCheck {
    public static void main(String[] args) {
        HashMap<String, Integer> fruites = new HashMap<String, Integer>();
        fruites.put("banana", 1);
        fruites.put("Apple", 2);
        fruites.put("Mango", 4);

        Scanner in = new Scanner(System.in);
        System.out.println("Check The key Exists in the HashMap");
        System.out.print("Enter Key to check : ");
        String checkkey = in.nextLine();
        if(fruites.containsKey(checkkey)){
            System.out.println(checkkey + " is Exists in the Map");
        }else{
            System.out.println(checkkey + " is not exists");
        }        
    }   
}
