public class MaxOfTriplet {
    public static void main(String[] args) {
        long[] arr = {1000000,1,1000000};
        System.out.println(maximumTripletValue(arr)); // Output should be 0
    }

    public static long maximumTripletValue(long[] arr)
    {
        int n = arr.length;
        long max = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long value = (arr[i] - arr[j]) * arr[k];
                    if (value > max) {
                        max = value;
                    }
                }
            }
        }
        return max;
    }
}