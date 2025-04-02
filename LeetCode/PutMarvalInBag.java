package LeetCode;

import java.util.Arrays;

public class PutMarvalInBag {
    public static void main(String[] args) {
        int[] weights = {1, 4, 2, 5, 2};
        int k = 3;
        System.out.println(putMarbles(weights, k)); // Output should be 3
    }

    public static long putMarbles(int[] weights, int k) {
        int n = weights.length;

        
        if (k == 1) {
            return 0;
        }

       
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = weights[i] + weights[i + 1];
        }

        
        Arrays.sort(arr);

        
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < k - 1; i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - 1 - i];
        }

        
        return maxSum - minSum;
    }
}
