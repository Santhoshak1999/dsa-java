import java.util.ArrayList;

public class Heap {
    void insert(ArrayList<Integer> al, int n){
        al.add(al.size()-1, n);
        int parent = (int)Math.floor(al.indexOf(n)/2);//get its parent index
        while(al.get(parent) > al.get(n)){
            swapArrayList(al, n, parent);
            n=parent;
            parent = n/2;
        }
    }

    void swapArrayList(ArrayList<Integer> arr, int n, int l){
        int temp = arr.get(n);
        arr.add(n, arr.get(l));
        arr.add(l, temp);
    }
    public static void main(String[] args){
        Heap h = new Heap();
        ArrayList<Integer> arrlist = new ArrayList<>();
        h.insert(arrlist, 8);
        h.insert(arrlist, 7);
        h.insert(arrlist, 9);
        h.insert(arrlist, 10);
        h.insert(arrlist, 11);
        h.insert(arrlist, 12);
        h.insert(arrlist, 14);
        h.insert(arrlist, 13);
        h.insert(arrlist, 10);
        for(int a : arrlist){
            System.out.println(a);
        }
        
    }
    
}
