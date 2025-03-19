

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = {2,2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    if (arr[j] > arr[j - 1]) {
                        break;
                    }
                }
            }
        }
    }

    // 349. Intersection of Two Arrays
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    hash.add(nums1[i]);
                }
            }
        }

        int[] result = new int[hash.size()];
        int index = 0;
        for (int num : hash) {
            result[index++] = num;
        }
        return result;
    }

    // 350. Intersection of Two Arrays II
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> hash = new ArrayList();
        List<Integer> resultLIst = new ArrayList();
        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         if (nums1[i] == nums2[j]) {
        //             hash.add(nums1[i]);
        //             break;
        //         }
        //     }
        //     if (nums2.length == i) {
        //         break;
        //     }
        // }
        for (int num : nums1) {
            hash.add(num);
        }
        for (int num : nums2) {
            if (hash.contains(num)) {
                resultLIst.add(num);
                System.out.println(hash);
                hash.remove(Integer.valueOf(num)); // Remove to avoid duplicates in result array.
            }
        }

        int[] result = new int[resultLIst.size()];
        int index = 0;
        for (int num : resultLIst) {
            result[index++] = num;
        }
        return result;
    }
}
