import java.util.Arrays;

public class OperationOnArray {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }

    public static int[] applyOperations(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *=2;
                nums[i+1] = 0;
            }
        }
        int start =0;
        int end = len-1;
        int[] resultArr = new int[len];
        for (int i : nums) {
            if (i>0) {
                resultArr[start++] = i;
                // start++;
            }
            else{
                resultArr[end--] =i;
            }
        }
        return resultArr;
    }
}
