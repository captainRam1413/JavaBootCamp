package LeetCode;

import java.util.*;

public class ClosestPrimeNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestPrimes(19, 31)));
    }

    public static int[] closestPrimes(int left, int right) {
        List<Integer> lefIntegers = new ArrayList<>();
        // List<Integer> rightIntegers = new ArrayList<>();
        // PriorityQueue list = new PriorityQueue<>();
        int mid = left +(right-left) / 2;
        for (int i = left; i <=right; i++) {
            if (check(i)) {
                lefIntegers.add(i);
            }
            
        }
        int min = Integer.MAX_VALUE;
        int returnArr[] = {-1,-1};
        // lefIntegers.addAll(rightIntegers);
        System.out.println(lefIntegers);
        for (int i = 0; i < lefIntegers.size()-1; i++) {
            // for (int j = i+1; j <lefIntegers.size(); j++) {
                int temp = lefIntegers.get(i+1)-lefIntegers.get(i); 
                if (temp < min) {
                    returnArr[0] = lefIntegers.get(i);
                    returnArr[1] = lefIntegers.get(i+1);
                    min = temp;
                }
            // }
        }

        return returnArr;
    }

    public static boolean check(int i)
    {
        for (int j = 2; j < i; j++) {
            if (i%j == 0) {
                return false;
            }
        }
        return true;
    }
}