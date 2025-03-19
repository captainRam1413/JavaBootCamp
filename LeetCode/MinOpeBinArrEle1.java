package LeetCode;

public class MinOpeBinArrEle1 {
    public static void main(String[] args) {
        int nums[] = {0,1,1,1};
        System.out.println(minOperations(nums));
        
    }

    public static int minOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == 0) {
                for (int j = 0; j < 3; j++) {
                    if (nums[i + j] == 1) {
                        nums[i + j] = 0;
                    }
                    else {
                        nums[i + j] = 1;
                    }
                }
                count++;
            }
        }

        if (nums[nums.length-1] == 0 || nums[nums.length-2] == 0) {
            return -1;
        }

        return count;
    }
}
