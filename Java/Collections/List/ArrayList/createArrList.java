package Collections;

import java.util.ArrayList;

public class createArrList {
    public static void main(String[] args) {
            //create array list of string
    ArrayList<String> colors = new ArrayList<String>();
    //add colors to array list
    colors.add("Red");
    colors.add("Green");
    colors.add("Orange");//here string is an objects
    colors.add("White");
    colors.add("Black");
    System.out.println(colors);

    //Print using for loop
    for(String color : colors){
        System.out.println(color);
    }

    }

    
}
