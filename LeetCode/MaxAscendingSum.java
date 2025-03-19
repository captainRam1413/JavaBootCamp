public class MaxAscendingSum {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,5,10,50};
        int[] arr2 = {10,20,30,40,50};
        int[] arr3 = {12,17,15,13,10,11,12};
        System.out.println(maxsum(arr1));
        System.out.println(maxsum(arr2));
        System.out.println(maxsum(arr3));
    }
    public static int maxsum(int[] arr)
    {
        int maxSum =0;
        int tempSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]) {
                tempSum +=arr[i];
            }
            else
            {
                if (tempSum>maxSum) {
                    maxSum = tempSum;
                }
                tempSum = arr[i];
            }
        }
        if (tempSum>maxSum) {
            return tempSum;
        }
        return maxSum;
    }
}
