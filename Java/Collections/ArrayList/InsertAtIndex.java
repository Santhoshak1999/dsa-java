package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InsertAtIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");//here string is an objects
        colors.add("White");
        colors.add("Black");
        System.out.println("Colors before Inserting elements at perticular index\n" + colors.toString());
        //insert colors to perticular index
        colors.add(0, "Pink");
        colors.add(3, "Blue");
        colors.add(5, "Yellow");

        //If you insert at index in which elements is already store 
        //then those element move to next index(+1)
        System.out.println("Colors after Inserting elements at perticular index\n"
         + colors.toString());

    
    
    }
    
}
