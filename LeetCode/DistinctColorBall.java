package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class DistinctColorBall {
    public static void main(String[] args) {
        int limit = 4;
        int[][] queries = { { 0, 1 },
                { 1, 2 },
                { 2, 2 },
                { 3, 4 },
                { 4, 5 } };
        System.out.println(limit);
        int[] result = queryResults(limit, queries);
        System.out.print("[");
        for (int i : result) {
        System.out.print(" " + i);
        }
        System.out.print("]");
    }

    public static int[] queryResults(int limit, int[][] queries) {
        int ballNo = limit + 1;
        HashMap<Integer, Integer> map = new HashMap<>(ballNo);
        int[] ball = new int[ballNo];
        // for (int i = 0; i < ballNo; i++) {
        // map.put(i, 0);
        // }
        // System.out.println(map.get(1));
        int len = queries.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            // map.replace(queries[i][0], queries[i][1]);
            ball[queries[i][0]] = queries[i][1];
            int val = getDistinct(ball);
            result[i] = val;
        }
        return result;
    }

    public static int getDistinct(int[] ball) {
        HashSet<Integer> color = new HashSet<>();
        for (int i : ball) {
            if (i != 0) {
                color.add(i);
            }
        }
        return color.size();
    }

    public static int getDistinct(HashMap map) {
        int count = 0;
        HashSet<Integer> color = new HashSet<>();
        for (int i = 0; i < map.size(); i++) {
            int c = (int) map.get(i);
            if (c != 0) {
                color.add((int) map.get(i));
            }

        }
        count = color.size();
        return count;
    }

}
