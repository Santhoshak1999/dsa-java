package Collections;

import java.util.ArrayList;
import java.util.Collections;
public class SortElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        Collections.addAll(colors, "Red", "Blue", "Green", "White", "Black");
        //Sort Elements
        Collections.sort(colors);
        System.out.println("Sorted Element");
        System.out.println(colors);
    }
    
}
