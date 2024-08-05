import java.util.ArrayList;
import java.util.List;

//Leetcode 228. Summary Ranges
//https://www.youtube.com/watch?v=LuR5cnVty48
public class Summary_Range {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        int start = nums[0], end = nums[0], temp = start;
        String a = String.valueOf(start);
        for (int i = 1; i < nums.length; i++) {
            end = nums[i];
            if (++temp == end) {
                a = String.valueOf(start) + "->" + String.valueOf(end);
            } else {
                result.add(a);
                start = end;
                temp = start;
                a = String.valueOf(start);
            }
        }
        result.add(start == end ? Integer.toString(start) : Integer.toString(start) + "->" + Integer.toString(end));
        return result;
    }

    public static void main(String[] args) {
        Summary_Range solution = new Summary_Range();

        int[] nums1 = {0, 1, 2, 4, 5, 7};
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        int[] nums3 = {};
        int[] nums4 = {0};

        System.out.println("Summary Ranges for nums1: " + solution.summaryRanges(nums1));
        System.out.println("Summary Ranges for nums2: " + solution.summaryRanges(nums2));
        System.out.println("Summary Ranges for nums3: " + solution.summaryRanges(nums3));
        System.out.println("Summary Ranges for nums4: " + solution.summaryRanges(nums4));
    }
}
