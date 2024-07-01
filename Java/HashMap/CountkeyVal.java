// package dsa-java.Java.HashMap;
import java.util.HashMap;
import java.util.Map;

public class CountkeyVal {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Java");
        hm.put(2, "C++");
        hm.put(3, "Python");
        hm.put(4, "C lang");
        hm.put(5, ".Net");

        //to get the size of the hash map use .size() method
        System.out.println("Size of the HashMap is: " + hm.size());

        // Else you can iterate the entry set
        int count = 0;
        for(Map.Entry<Integer, String> x : hm.entrySet()){
            count++;
        }
        System.out.println(count);

    }
    
}
