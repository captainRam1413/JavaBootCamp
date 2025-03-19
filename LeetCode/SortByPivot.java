import java.util.*;


public class SortByPivot {
    public static void main(String[] args) {
        int[] arr = {};
        int pivot = 0;
        System.out.println(Arrays.toString(pivotArray(arr,pivot)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> great = new ArrayList<>();

        for (int i : nums) {
            if (i==pivot) {
                equal.add(i);
            }
            if (i>pivot) {
                great.add(i);
            }
            if (i<pivot) {
                less.add(i);
            }
        }
        int i =0;
        int[] arr = new int[nums.length];
        for (Integer j : less) {
            arr[i] = j;
            i++;
        }
        for (Integer j : equal) {
            arr[i] = j;
            i++;
        }
        for (Integer j : great) {
            arr[i] = j;
            i++;
        }
        return arr;
    }
}
