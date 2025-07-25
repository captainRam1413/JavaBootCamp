import java.util.*;

public class UniqueSum {
    public static void main(String[] args) {
        int[] nums1 = {1,2,-1,-2,1,0,-1};
        System.out.println("Example 1: nums = " + Arrays.toString(nums1));
        System.out.println("Result: " + maxUniqueSubarraySum(nums1) + " (Expected: 3)");

        int[] nums2 = {1,2,3,4,5};
        System.out.println("Example 2: nums = " + Arrays.toString(nums2));
        System.out.println("Result: " + maxUniqueSubarraySum(nums2) + " (Expected: 15)");

        int[] nums3 = {1,1,0,1,1};
        System.out.println("Example 3: nums = " + Arrays.toString(nums3));
        System.out.println("Result: " + maxUniqueSubarraySum(nums3) + " (Expected: 1)");
        
        int[] nums4 = {-20, 20};
        System.out.println("Example 4: nums = " + Arrays.toString(nums4));
        System.out.println("Result: " + maxUniqueSubarraySum(nums4) + " (Expected: 20)");
        
        int[] nums5 = {2, -10, 6};
        System.out.println("Example 5: nums = " + Arrays.toString(nums5));
        System.out.println("Result: " + maxUniqueSubarraySum(nums5) + " (Expected: 8)");
    }

    public static int maxUniqueSubarraySum(int[] nums) {
        // This problem asks for maximum sum of subsequence with unique elements
        // Strategy: Take all unique positive numbers, skip negatives and duplicates
        Set<Integer> seen = new HashSet<>();
        int maxSum = 0;
        
        for (int num : nums) {
            // Only process if we haven't seen this number before
            if (!seen.contains(num)) {
                seen.add(num);
                // Only add positive numbers to maximize sum
                if (num > 0) {
                    maxSum += num;
                }
            }
        }
        
        return maxSum;
    }
}
