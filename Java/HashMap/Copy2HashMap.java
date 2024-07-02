package HashMap;

import java.util.HashMap;

public class Copy2HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();

        hashmap1.put(1, "Red");
        hashmap1.put(3, "Black");
        hashmap1.put(2, "Green");
        hashmap1.put(4, "Yellow");


        System.out.println(hashmap1);

        //insert values to hashmap2
        hashmap2.put(1, "White");
        hashmap2.put(2, "Blue");
        hashmap2.put(3,  "Pink");
        hashmap2.put(4, "Creame");
        System.out.println(hashmap2);

        //copy all the entries from hashmap2 from hashmap1
        
        //hashmap iserted values are called "entries"
        
        hashmap2.putAll(hashmap1);
         
        // The entries in hashmap2 are overwritten 
        // because hashmap2.putAll(hashmap1); copies all entries from hashmap1 into hashmap2, replacing existing entries with the same keys.

        //entries after coping
        System.out.println(hashmap2);

        //delete / clear the  hashmap entries
        hashmap1.clear();

        //insert new entries with diffrent key
        hashmap1.put(6, "pink");
        hashmap1.put(7, "blue");
        hashmap1.put(8, "gold");
        hashmap1.put(9, "silever");


        hashmap2.putAll(hashmap1);
        System.out.println(hashmap2);
        


    }
    
}
