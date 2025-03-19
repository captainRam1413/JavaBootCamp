public class SumOfOddSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr));
    }

    public static int numOfSubarrays(int[] arr) {
        int sum =0;
        int count =0;
        int odd_count =0;
        int even_count =1;
        int mod = 1000000007;
        for (int i : arr) {
            sum += i;
            if(sum % 2 == 0){
                count = (count + odd_count) % mod;
                even_count++;
            }else{
                count = (count + even_count) % mod;
                odd_count++;
            }
        }
        return count;


        // long oddCount = 0, prefixSum = 0;
        // for (int a : arr) {
        //     prefixSum += a;
        //     oddCount += prefixSum % 2;
        // }
        // oddCount += (arr.length - oddCount) * oddCount;
        // return (int)(oddCount % 1_000_000_007);  
    }
}
