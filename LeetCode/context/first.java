import java.util.*;

public class first {
    public static long sumThreeLargestUniquePrimes(String s) {
        Set<Long> primes = new HashSet<>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                String sub = s.substring(i, j);
                // Skip substrings with leading zeros (except "0")
                if (sub.length() > 1 && sub.charAt(0) == '0') continue;
                long num = Long.parseLong(sub);
                if (num > 1 && isPrime(num)) {
                    primes.add(num);
                }
            }
        }
        List<Long> primeList = new ArrayList<>(primes);
        Collections.sort(primeList, Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < Math.min(3, primeList.size()); ++i) {
            sum += primeList.get(i);
        }
        return sum; // Return as long, not int
    }

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        long sqrt = (long)Math.sqrt(num);
        for (long i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sumThreeLargestUniquePrimes("12234")); // Output: 1469
        System.out.println(sumThreeLargestUniquePrimes("111"));   // Output: 11
        System.out.println(sumThreeLargestUniquePrimes("0007"));  // Output: 7
        System.out.println(sumThreeLargestUniquePrimes("0"));     // Output: 0
    }
}
