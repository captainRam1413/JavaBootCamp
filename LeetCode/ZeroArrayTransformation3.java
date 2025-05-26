import java.util.HashMap;

public class ZeroArrayTransformation3 {
    public static void main(String[] args) {
        int[] arr = {0,3};
        int[][] query = {
            {0,1},
            {0,0},
            {0,1},
            {0,1},
            {0,0}
            // {1,2}
        };
        System.out.println(maxRemove(arr, query)); 
    }

    public static int maxRemove(int[] nums, int[][] queries) {
        int n = nums.length, m = queries.length;
        int[] diff = new int[n + 2];
        
        for (int[] q : queries) {
            diff[q[0]]++;
            diff[q[1] + 1]--;
        }
        int[] cover = new int[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            cover[i] = curr;
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > cover[i]) return -1;
        }
        
        int[] need = nums.clone();
        int[] prefix = new int[n + 2];
        int remove = 0;
        for (int i = m - 1; i >= 0; i--) {
            int l = queries[i][0], r = queries[i][1];
            
            prefix[l]++;
            prefix[r + 1]--;
            boolean canRemove = true;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += prefix[j];
                if (need[j] > cover[j] - sum) {
                    canRemove = false;
                    break;
                }
            }
            if (canRemove) {
                remove++;
                
            } else {
                
                prefix[l]--;
                prefix[r + 1]++;
            }
        }
        return remove;
    }
}
