package Collections.ArrayList;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swapTwoElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, "Red", "Green", "Black", "White", "Pink");
        System.out.println("Before Swapping");
        System.out.println(colors);
        //manual swapping
        Swap(colors, 0, 3);
        System.out.println(colors);

        //build in Method for swapping
        Collections.swap(colors, 0, 3);
        System.out.println(colors);

    }

    public static <T> void Swap(List<T> obj, int i, int j){
        T temp = obj.get(i);
        //update the values
        obj.set(i, obj.get(j));
        obj.add(j, temp);
    }    
}

