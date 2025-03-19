

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77 };
        int target = 33;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            // find the middle element
            // int mid = (start+end)/2;
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
