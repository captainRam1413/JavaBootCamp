package LeetCode;

public class GetAbsSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {2,-5,1,-4,3,-2};
        System.out.println(new GetAbsSumOfSubArray().maxAbsoluteSum(arr));
    }

    public int maxAbsoluteSum(int[] a) {
        // int maxSum = getMaxSum(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] *= -1;
        // }
        // int minSum = getMaxSum(nums);
        // System.out.println(minSum+" "+maxSum);

        int n=a.length;
        int tot=0,sum=0;
        int s=a[0];
        int mi=0,ma=0;
        if(a[0]<mi)mi=a[0];
        if(a[0]>ma)ma=a[0];
        for(int i=1;i<n;i++)
        {
            s=s+a[i];
            if(s>ma)ma=s;
            if(s<mi)mi=s;
        }

        return Math.abs(ma-mi);



        // return Math.max(maxSum, Math.abs(minSum));
    }

    public int getMaxSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    // public int getMinSum(int[] nums) {
    //     int minSum = Integer.MAX_VALUE;
    //     int currentSum = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         currentSum += nums[i];
    //         minSum = Math.min(minSum, currentSum);
    //         if (currentSum > 0) {
    //             currentSum = 0;
    //         }
    //     }
    //     return minSum;
    // }
}
