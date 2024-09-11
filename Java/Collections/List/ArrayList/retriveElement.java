package Collections;

import java.util.ArrayList;

public class retriveElement {
    public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    //add colors to array list
    colors.add("Red");
    colors.add("Green");
    colors.add("Orange");//here string is an objects
    colors.add("White");
    colors.add("Black");
    
    //print element using index values
    // for(int i=0;i<colors.size() - 1;i++){
    //     System.out.println(colors.get(i));

    // }

    System.out.println(colors.get(0).toString() + " " + //Convert object to string
    colors.get(1).toString() + " "  +
    colors.get(2).toString() + " " + 
    colors.get(3).toString() + " " + 
     colors.get(4).toString());

}
    
}
