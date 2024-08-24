public class QS {
    static int partition(int[] arr, int lb, int ub){
        //taking first element as pivot element
        int pivot = arr[lb], start=lb, end = ub;;
        while(start < end){
            while(arr[start] <= pivot && start < ub){
                start++;
            }
            while(arr[end] > pivot && end > lb){
                end--;
            } 
            if(start <= end){
                swap(arr, start, end);
                System.out.println("Swapped: " +  java.util.Arrays.toString(arr));
            }
        }
        swap(arr, end, lb);
        System.out.println("Pivote Swapped: " +  java.util.Arrays.toString(arr));
        return end;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
        

    static int[] quickSort(int[] arr, int lb, int ub){
        if(lb < ub){
            int pos = partition(arr, lb, ub);
            quickSort(arr, lb, pos-1);
            quickSort(arr, pos+1, ub);
        }
        return arr;
         
    }
    
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};  // Example array
        int n = arr.length;  // Length of the array

        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
    
    // Call quickSort to sort the array
        int[] a = quickSort(arr, 0, n-1);
    
        System.out.println("Sorted Array: " + java.util.Arrays.toString(a));
    }
    
}
