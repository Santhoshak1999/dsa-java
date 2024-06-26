package Collections;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        //for(String str : colors){
        //     if(str == "Red"){
        //         System.out.println("Found Element");
        //     }
        // }
        if(colors.contains("Red")){
            System.out.println("Found the Element");
        }else{
            System.out.println("Element Not Found");
        }



    }
}
