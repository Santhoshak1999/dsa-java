import java.util.Arrays;

public class Main {
    static int[] bubbleSort(int[] arr) {
        // Correct bubble sort implementation
        for(int i=0;i<arr.length-1;i++){
            int flag = 0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                    flag = 1;
                }
            }
            if(flag == 1)  break;
        }
        return arr;
    }

    // static int[] insertionSort(int[] arr){
    //     for(int i=1;i<arr.length;i++){
    //         int temp = arr[i], j = i-1;//pointer moving to sorted array in decending order
    //         while(temp > arr[j] && j > 0){
    //             arr[j+1] = arr[j];
    //         }
    //         arr[j] = temp;
    //     }
    //     return arr;

    // }
    static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minidex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minidex] > arr[j]){
                    minidex = j;
                }
            }
            if(minidex != i){
                arr[i] = arr[i]^arr[minidex];
                arr[minidex] = arr[i]^arr[minidex];
                arr[i] = arr[i]^arr[minidex];
            }
            
        }
        return arr;
    }
    

    public static void main(String[] args) {
        // Call the BubbleSort method with an inline array
        //Main m = new Main();
        int[] bs = bubbleSort(new int[]{1, 2, 5, 3, 9, 0});
        
        // Print the sorted array
        System.out.println(Arrays.toString(bs));
        // int[] is =insertionSort(new int[]{1,8,4,7,3,0,2});
        // System.out.println(Arrays.toString(is));
        int[] selectionsort = selectionSort(new int[]{1,3,6,2,9,0,5});
        System.out.println(Arrays.toString(selectionsort));
    }
}
