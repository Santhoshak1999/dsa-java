package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class extractPortionArrayList {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "Red", "Green", "Blue", "White", "Black", "Pink");
        System.out.println("ArrayList before");
        for(String color : colors){
            System.out.println(color);
        }
        System.out.println("Elements in sublist: \n" +
                            "--------------------");
        List<String> subcolors = colors.subList(0, 3);
        for(String color : subcolors){
            System.out.println(color);
        }

    }
    
}
