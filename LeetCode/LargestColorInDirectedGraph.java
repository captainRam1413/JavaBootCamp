import java.util.*;

public class LargestColorInDirectedGraph {
    public static void main(String[] args) {
        String colors1 = "abaca";
        int[][] edges1 = {{0, 1}, {0, 2}, {2, 3}, {3, 4}};
        System.out.println(largestPathValue(colors1, edges1)); // Output: 3

        // Example 2
        String colors2 = "a";
        int[][] edges2 = {{0, 0}};
        System.out.println(largestPathValue(colors2, edges2)); // Output: -1
    }
    // Fix: largetstColor is misspelled, should be largestPathValue
    // Also, the colorCount array should be per node, not global

    // Add the correct function for testing
    public static int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            indegree[e[1]]++;
        }
        int[][] dp = new int[n][26];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) if (indegree[i] == 0) q.offer(i);
        int visited = 0, ans = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            visited++;
            int c = colors.charAt(u) - 'a';
            dp[u][c]++;
            ans = Math.max(ans, dp[u][c]);
            for (int v : graph.get(u)) {
                for (int i = 0; i < 26; i++)
                    dp[v][i] = Math.max(dp[v][i], dp[u][i]);
                indegree[v]--;
                if (indegree[v] == 0) q.offer(v);
            }
        }
        return visited == n ? ans : -1;
    }

    // public static int largetstColor(String color, int[][] edges)
    // {
    //     int n = color.length();
    //     int[] indegree = new int[n];
    //     List<List<Integer>> graph = new ArrayList<>();

    //     for (int i = 0; i < n; i++) {
    //         graph.add(new ArrayList<>());
    //     }

    //     for (int[] edge : edges) {
    //         int u = edge[0];
    //         int v = edge[1];
    //         graph.get(u).add(v);
    //         indegree[v]++;
    //     }

    //     Queue<Integer> queue = new LinkedList<>();

    //     for (int i = 0; i < n; i++) {
    //         if (indegree[i] == 0) {
    //             queue.offer(i);
    //         }
    //     }
    //     int[] colorCount = new int[26]; 
    //     int maxColorCount = 0;
    //     int visitedNodes = 0;

    //     while (!queue.isEmpty()) {
    //         ++visitedNodes;
            
    //         int node = queue.poll();
    //         char c = color.charAt(node);
    //         colorCount[c - 'a']++;

    //         maxColorCount = Math.max(maxColorCount, colorCount[c - 'a']);

    //         for (int neighbor : graph.get(node)) {
    //             indegree[neighbor]--;
    //             if (indegree[neighbor] == 0) {
    //                 queue.offer(neighbor);
    //             }
    //         }
    //     }

    //     return visitedNodes==n? maxColorCount:-1;
    // }
}
