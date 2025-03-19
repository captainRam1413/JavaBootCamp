//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
//3105. Longest strictly increasing or strictly decreasing subarray
public class LarLenOfArr {
    public static void main(String[] args) {
        int arr[]={1,4,3,3,2};
        System.out.println(longestMonotonicSubarray(arr));
    }

    public static int longestMonotonicSubarray(int[] arr) {
        int countincr = countIncr(arr);
        int countdre = countDre(arr);
        if (countincr > countdre)
            return countincr;
        return countdre;

        // 0ms solution
        // int incLength = 1;
        // int decLength = 1;
        // int maxLength = 1;

        // for(int pos = 0; pos < nums.length - 1; pos++) {
        //     if(nums[pos + 1] > nums[pos]) {
        //         incLength++;
        //         decLength = 1;
        //     } else if(nums[pos + 1] < nums[pos]) {
        //         decLength++;
        //         incLength = 1;
        //     } else {
        //         incLength = 1;
        //         decLength = 1;
        //     }
        //     maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        // }
        // return maxLength;
    
    }

    public static int countDre(int[] arr) {
        int count =0;
        int temp =1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                temp++;
            }
            else
            {
                if (temp>count) {
                    count = temp;
                }
                temp=1;
            }
        }
        if (temp>count) {
            return temp;
        }
        return count;
    }

    public static int countIncr(int[] arr) {
        int count =0;
        int temp =1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]) {
                temp++;
            }
            else
            {
                if (temp>count) {
                    count = temp;
                    temp=1;
                }
            }
        }
        if (temp>count) {
            return temp;
        }
        return count;
    }
}
