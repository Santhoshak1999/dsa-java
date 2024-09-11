package Collections;

import java.util.ArrayList;
import java.util.Collections;
public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        Collections.addAll(colors, "Red", "Green", "Blue", "Yellow");
        System.out.println("Before updating the values: ");
        System.out.println(colors);
        //Update the element using set  method
        colors.set(2, "Yellow");
        System.out.println(colors);


    }
}
