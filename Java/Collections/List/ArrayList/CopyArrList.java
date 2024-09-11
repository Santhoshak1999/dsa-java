package Collections.ArrayList;

import java.util.*;

//Write a java program to copy one arrayList into another.
public class CopyArrList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "1", "2", "3", "4", "5");
    
        List<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, "A", "B", "C", "D", "E");

        System.out.println(list1.toString() + list2.toString());

        //swapping one array into another using temp variable
        List<String>  temp = list1;
        list1 = list2;
        list2 = temp;

        System.out.println(list1.toString() + list2.toString());

        //Syntax
        //public static <T> void copy(List<? super T> dest, List<? extends T> src)


        Collections.copy(list1, list2);
        System.out.println(list1.toString() + list2.toString());
        Collections.copy(null, null);    
    }
    
    
}
