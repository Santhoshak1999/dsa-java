public class reverse_Array {

    public static void revArrRec(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        //swap the elements
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        revArrRec(arr, l+1, r-1);
    }

    public static void rev_Array(int[] arr){
        revArrRec(arr, 0, arr.length-1);
    }

     public static void main(String[] args) {
        int[] arr = {1,7,4,9,2,4};
        rev_Array(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        } 
     }
}