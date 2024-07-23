import java.util.HashMap;
import java.util.Map;

public class NearbyDuplicateCheck {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mapindex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapindex.containsKey(nums[i])) {
                int index = mapindex.get(nums[i]);
                if (Math.abs(i - index) <= k) return true;
            }
            mapindex.put(nums[i], i); // key = value, value = index
        }
        return false;
    }

    public static void main(String[] args) {
        NearbyDuplicateCheck checkNearBy = new NearbyDuplicateCheck();

        // Example 1
        int[] nums1 = {1, 0, 1, 1};
        int k1 = 1;
        System.out.println("Example 1: " + checkNearBy.containsNearbyDuplicate(nums1, k1)); // Output: true

        // Example 2
        int[] nums2 = {1, 2, 3, 1};
        int k2 = 3;
        System.out.println("Example 2: " + checkNearBy.containsNearbyDuplicate(nums2, k2)); // Output: true

        // Example 3
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("Example 3: " + checkNearBy.containsNearbyDuplicate(nums3, k3)); // Output: false

        // Example 4
        int[] nums4 = {4, 1, 2, 3, 4};
        int k4 = 3;
        System.out.println("Example 4: " + checkNearBy.containsNearbyDuplicate(nums4, k4)); // Output: true

        // Example 5
        int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k5 = 15;
        System.out.println("Example 5: " + checkNearBy.containsNearbyDuplicate(nums5, k5)); // Output: false
    }
}
