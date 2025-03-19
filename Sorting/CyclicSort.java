

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={3,3,3,3,3};
        // sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(findDisappearedNumbers(arr));
        System.out.println(findDuplicate(arr));

    }

    public static void sort(int[] arr) {
        // int count = 0;
        // while (count < arr.length) {
        //     if (arr[count] == count-1) {
        //         count++;
        //     } else {
        //         int exist = arr[arr[count]-1];
        //         if (arr[count] != exist) {
        //             int temp = arr[count];
        //             arr[count] = arr[temp-1];
        //             arr[temp-1] = temp;
        //         }
        //         else{
        //             count++;
        //         }
        //     }
        // }

        int i =0;
        while (i< arr.length) {
            int correct = arr[i]-1;
            if (arr[correct] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            {
                i++;
            }
        }
    }

    public static int missingNumber(int[] nums) {
        int missingNo = nums.length;
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                missingNo = i;
                break;
            }
        }
        return missingNo;
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!= i+1) {
                result.add(i+1);
            }
        }
        return result;
    }

    public static int findDuplicate(int[] nums) {
        sort(nums);

        System.out.println(Arrays.toString(nums));
        return nums[nums.length-1];
        
    }
}
