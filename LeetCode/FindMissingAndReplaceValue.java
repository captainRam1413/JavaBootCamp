package LeetCode;

import java.util.*;

public class FindMissingAndReplaceValue {
    public static void main(String[] args) {
        int arr[][] = {
                { 9, 1, 7 },
                { 8, 9, 2 },
                { 3, 4, 6 }
        };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map.containsKey(grid[i][j])) {
                    map.replace(grid[i][j], 2);
                } else {
                    map.put(grid[i][j], 1);
                }
            }
        }

        int[] returnArr = new int[2];
        for (int i = 1; i <= len * len; i++) {
            if (map.containsKey(i) && map.get(i) == 2) {
                returnArr[0] = i;
            }

            if (!map.containsKey(i)) {
                returnArr[1] = i;
            }

        }

        return returnArr;
    }
}
