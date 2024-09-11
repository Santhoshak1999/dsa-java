package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ShuffleElements {
    public static void main(String[] args) {
        List<String> Colors = new ArrayList<>();
        Collections.addAll(Colors, "Black", "Green", "White", "Blue", "Yellow", "Orange");
        
        System.out.println("Colors Before shuffle \n" +
                            "---------------------");
        System.out.println(Colors);
        
        Collections.shuffle(Colors);
        System.out.println("---------------------");
        
        System.out.println("Colors after shuffle\n" + 
                            "-------------------");
        System.out.println(Colors);
        
        shuffleArray(Colors);

        System.out.println("Colors after manual sorting");
        System.out.println(Colors);
    }
    

    //shuffling algorithm(manual)
    public static <T> void shuffleArray(List<T> list){
        Random random = new Random();
        int size = list.size(), j=0;
        for(int i=0;i<size;i++){
            j=random.nextInt(size);
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

}

