

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0};
        // sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        // System.out.println(containsDuplicate(arr));
        // System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }

    public static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getMax(arr,0,last);
            swap(arr,max,last);
        }
    }

    public static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    public static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // 217. Contains Duplicate leatcode
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // 268. Missing Number leatcode
    public static int missingNumber(int[] nums) {
        int missingNo =nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i)
            {
                missingNo = i;
                break;
            }
        }
        return missingNo;
    }
}
