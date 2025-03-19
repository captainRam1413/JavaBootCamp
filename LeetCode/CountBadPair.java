// 2364. Count Number of Bad Pairs

import java.util.HashMap;

public class CountBadPair {
    
    public static void main(String[] args) {
        int[] nums = {4,1,3,3};
        int[] nums1={1,2,4,5,3};
        System.out.println(countBadPairs(nums1));
    }
    public static long countBadPairs(int[] nums) {
        long count = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            if (map.containsKey(nums[i]-i)) {
                count += map.get(nums[i]-i);
            }
            map.put(nums[i]-i, map.getOrDefault(nums[i]-i, 0)+1);
        }

        return (nums.length*(nums.length-1)/2) -count;
    }
}
