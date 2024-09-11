package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CompareArrList {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        Collections.addAll(colors1, "Red", "Green", "Black", "White", "Pink");

        ArrayList<String> colors2 = new ArrayList<>();
        Collections.addAll(colors2, "Red", "Green", "White", "Pink");

        ArrayList<String> result = new ArrayList<>();
        for(String color : colors1){
            if(colors2.contains(color)){
                result.add("Yes");
            }
            else{
                result.add("No");
            }
        }
        System.out.println(result);
    }
    
}
