import java.util.ArrayList;

public class MS {

    static void MergeSort(int[] arr, int lb, int ub){
        if(lb < ub){
            int mid = (lb+ub)/2;
            MergeSort(arr, lb, mid);
            MergeSort(arr, mid+1, ub);
            MergeArr(arr, lb, mid, ub);
        }

    }
    static int[] MergeArr(int[] arr, int lb, int mid, int ub){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=lb, j=mid+1, k=lb;
        while(i<=mid && j <= ub){
            if(arr[i] < arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=ub){
            temp.add(arr[j]);
            j++;
        }
        while(k<=ub){
            arr[k] = temp.get(k - lb);
            k++;
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Call MergeSort on the entire array
        MergeSort(arr, 0, n - 1);

        System.out.println("\n\nSorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
