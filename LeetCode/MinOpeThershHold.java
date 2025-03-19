import java.util.*;

public class MinOpeThershHold {
    public static void main(String[] args) {
        int[] arr = { 999999999,999999999,999999999 };
        int k = 1000000000;
        System.out.println(minOperations(arr, k));
    }

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        PriorityQueue<Long> list = new PriorityQueue<>();
        for (int i : nums) {
            list.add((long)i);
        }
        while (list.isEmpty()) {
            long x = list.poll();
            if (x>=k) {
                break;
            }
            
            long y =list.poll();
            
            long val = Math.min(x, y) * 2 + Math.max(x, y);
            list.add(val);
            count += 1;
            // System.out.println("x:"+x+" y:"+y+" val:"+val+" count:"+count);

        //     PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int num:nums){
        //     if(num<k) pq.add(num);
        // }
        // int op = 0;

        // while(!pq.isEmpty()){
        //     int x = pq.poll();
        //     op++;
        //     if(pq.isEmpty()) break;
        //     int y = pq.poll();
        //     long up = 2l * x + y;
        //     if(up<k) pq.add((int)up);
        // }
        // return op;
        }
        return count;
    }

    public static boolean check(List<Long> list, int k) {
        boolean t = true;
        int count = 0;
        for (long i : list) {
            if (i >= k) {
                count += 1;
            }
        }
        if (count == list.size()) {
            return false;
        }
        return true;
    }
    public static long mn(List<Long> list){
        long temp = Long.MAX_VALUE;
        for (Long l : list) {
            if (l<temp) {
                temp = l;
            }
        }
        return temp;
    }
}
