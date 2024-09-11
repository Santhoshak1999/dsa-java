package Collections.ArrayList;

import java.util.*;

public class ReverseElements {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        Collections.addAll(colors, "Red", "White", "Black", "Green", "Yellow");
        System.out.println("Before reverse the elements");
        System.out.println(colors);
        System.out.println();

        //Reverse the Element
        Collections.reverse(colors);
        System.out.println("After Reverse the Elements");
        System.out.println(colors);
    }
 

    
}
