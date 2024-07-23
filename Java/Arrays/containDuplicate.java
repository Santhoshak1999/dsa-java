import java.util.Arrays;

public class containDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Time complexity = O(n) and Space Complexity = O(n) using hashset
        // Set<Integer> hashset = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (hashset.contains(nums[i])) {
        //         return true;
        //     }
        //     hashset.add(nums[i]);
        // }
        // return false;

        // Another method is to sort the array and check its neighbors
        // Time complexity = O(n log n) and Space Complexity = O(1)
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;

        // Another method is to iterate each element with the other elements
        // Time Complexity = O(n^2) and Space Complexity = O(1)
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }

    public static void main(String[] args) {
        containDuplicate solution = new containDuplicate();
        int[] nums1 = {2,6,3,4,1};
        int[] nums2 = {2,4,3,6,9,2};

        // Print the array
        System.out.println("Array: " + Arrays.toString(nums1));

        // Check for duplicates
        boolean hasDuplicatesnums1 = solution.containsDuplicate(nums1);
        System.out.println("Contains duplicates: " + hasDuplicatesnums1);
        System.out.println("Array: " + Arrays.toString(nums2));

        boolean hasDuplicatesnums2 = solution.containsDuplicate(nums2);
        System.out.println("Contains duplicates: " + hasDuplicatesnums2);

    }
}
