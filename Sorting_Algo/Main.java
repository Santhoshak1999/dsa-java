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

    static int[] insertionSort(int[] arr){
        for(int i=0;i<arr.length-1-1;i++){
            int temp = arr[i];
            int j=i;
            for(j=i;j>=0;j--){
                if(arr[j] < temp){
                    arr[j+1] = temp;
                    continue;
                }
                arr[j+1] = arr[j];

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
        int[] is =insertionSort(new int[]{1,8,4,7,3,0,2});
        System.out.println(Arrays.toString(is));
    }
}
