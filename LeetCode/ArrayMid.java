import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMid {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2 };
        System.out.println("" + findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = nums1.length; i < nums2.length + nums1.length; i++) {
            arr[i] = nums2[i - nums1.length];
        }
        Arrays.sort(arr);
        int mid = arr.length / 2;
        double val = arr[mid]; 
        double val2 =arr[(arr.length-1) - mid];
        double value = (val+val2)/2;
        return value;
    }
}
