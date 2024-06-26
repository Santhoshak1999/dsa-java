package Collections;

import java.util.ArrayList;

import javax.print.attribute.standard.OrientationRequested;

public class removeElement {
    public static void main(String[] args) {
            //create array list of string
    ArrayList<String> colors = new ArrayList<String>();
    //add colors to array list
    colors.add("Red");
    colors.add("Green");
    colors.add("Orange");//here string is an objects
    colors.add("White");
    colors.add("Black");
    System.out.println("Colors before removing the element");
    System.out.println(colors);


    //remove element Orange
    colors.remove("Orange");

    System.out.println("Colors after removing Orange object/element");
    System.out.println(colors);

    //remove element by index
    colors.remove(2);
    System.out.println(colors);
    
    }
}   
