import java.util.Arrays;

public class Main {

    int[] BubbleSort(int[] arr) {
        // Correct bubble sort implementation
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1] using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Call the BubbleSort method with an inline array
        Main m = new Main();
        int[] bs = m.BubbleSort(new int[]{1, 2, 5, 3, 9, 0});
        
        // Print the sorted array
        System.out.println(Arrays.toString(bs));
    }
}
