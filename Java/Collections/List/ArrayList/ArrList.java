package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();  //<> angular brakets

        //Imp
        // if im creating arraylist class using collection interface, 
        // then i can only use the method which are inside the collection, 
        // and it is not possible to use the get() and other methods in the list.
        nums.add(12);//The number actually added here are not actually number 
        nums.add(13);//These are the object type
        nums.add(20);
        nums.add(58);
        nums.add(00);
        nums.add(43);
        System.out.println(nums);
        for(int number : nums){ //here int is object type
            System.out.println(
                number
            );
       
        }
        System.out.println("Array List at index 2 : " + nums.get(0));//Using Collection interface, which does not have get(int) method
        System.out.println("Array List at index 2 : " + nums.get(0));//List have some extra methods
        System.out.println("Array List at index 2 : " + nums.get(0));
        System.out.println("Array List at index 2 : " + nums.get(0));
    }
}
