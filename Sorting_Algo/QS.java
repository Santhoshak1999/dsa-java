public class QS {
    
    static int partision(int[] arr, int lb, int ub){
        //taking first element as pivot element
        int pivot = arr[lb], start = lb, end = ub;
        while(start < end){
            while(start < ub  && arr[start] <= pivot){
                start++;
            }
            while(end > lb && arr[end] > pivot){
                end--;
            }
            if(start < end){
                swap(arr, start, end);
            }
        }
        swap(arr, lb, end);//lb is a pivotal element index
        return end;
    }

    static void swap(int[] arr, int a, int b){
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }

    static int[] quickSort(int[] arr, int lb, int ub){
        if(lb < ub){
            int position = partision(arr, lb, ub);
            quickSort(arr, lb, position - 1);
            quickSort(arr, position+1, ub);
        }
        return arr;
    }
    
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};  // Example array
        int n = arr.length;  // Length of the array

        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
    
    // Call quickSort to sort the array
        quickSort(arr, 0, n-1);
    
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
    }
    
}
