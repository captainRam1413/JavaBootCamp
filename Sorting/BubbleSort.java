

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4};
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int nums[] = {};
        // System.out.println("Before Sorting: "+Arrays.toString(arr));
        // sort(arr);
        // System.out.println("After Sorting : "+Arrays.toString(arr));
        merge(arr1, 3, arr2, 3);
        // System.out.println("After Merging: "+Arrays.toString(arr1));
        System.out.println(majorityElement(nums));
        System.out.println(Arrays.toString(nums));
        
        
    }
    public static void sort(int[] arr)
    {
        boolean swap;
        for(int i = 0 ; i<=arr.length;i++)
        {
            swap = false;
            for(int j = 0 ;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    // 88. Merge Sorted Array
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ;i<n;i++)
        {
            // System.out.println(i+m);
            nums1[i+m] = nums2[i];
        }
        sort(nums1);
    }

    // 169. Majority Element
    public static int majorityElement(int[] nums) {
        int returnValue =nums[0];
        Arrays.sort(nums);
        int count = 0;
        int tempcount = 0;

        for(int i =1;i<nums.length;i++)
        {
            if (nums[i] == nums[i-1]) {
                tempcount++;
            }
            // if(count > nums.length/2)
            // {
            //     returnValue = nums[i];
            //     break;
            // }
            if(nums[i] > nums[i-1])
            {
                if(tempcount > count)
                {
                    count = tempcount;
                    returnValue = nums[i-1];
                }
                tempcount = 0;
            }
            if(tempcount > count)
            {
                count = tempcount;
                returnValue = nums[i];
            }
        }
        // if(tempcount>count)
        // {
        //     returnValue = nums[nums.length-1];
        // }
        return returnValue;
    }
}
