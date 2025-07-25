public class MaxScoreFromRemovingText {

    public static void main(String[] args) {
        // Test Example 1
        String s1 = "cdbcbbaaabab";
        int result1 = maximumScore(s1, 4, 5);
        System.out.println("Example 1: s = \"" + s1 + "\", x = 4, y = 5");
        System.out.println("Result: " + result1 + " (Expected: 19)");
        System.out.println();
        
        // Test Example 2
        String s2 = "aabbaaxybbaabb";
        int result2 = maximumScore(s2, 5, 4);
        System.out.println("Example 2: s = \"" + s2 + "\", x = 5, y = 4");
        System.out.println("Result: " + result2 + " (Expected: 20)");
        System.out.println();
        
        // Additional test case
        String s3 = "aabbab";
        int result3 = maximumScore(s3, 3, 1);
        System.out.println("Example 3: s = \"" + s3 + "\", x = 3, y = 1");
        System.out.println("Result: " + result3);
    }

    
    static int maximumScore(String s, int x, int y) {
        // Determine which operation should be prioritized
        // We want to do the higher-scoring operation first
        if (x < y) {
            // If y > x, prioritize "ba" removal first
            return removeFirst(s, 'b', 'a', y, x);
        } else {
            // If x >= y, prioritize "ab" removal first
            return removeFirst(s, 'a', 'b', x, y);
        }
    }
    
    // Helper method to remove the prioritized substring first, then the other
    static int removeFirst(String s, char first, char second, int firstScore, int secondScore) {
        int score = 0;
        
        // Step 1: Remove all instances of first+second using a stack
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == first && c == second) {
                // Found a match, remove the previous character and don't add current
                stack.deleteCharAt(stack.length() - 1);
                score += firstScore;
            } else {
                stack.append(c);
            }
        }
        
        // Step 2: Remove all instances of second+first from the remaining string
        StringBuilder finalStack = new StringBuilder();
        for (char c : stack.toString().toCharArray()) {
            if (finalStack.length() > 0 && finalStack.charAt(finalStack.length() - 1) == second && c == first) {
                // Found a match, remove the previous character and don't add current
                finalStack.deleteCharAt(finalStack.length() - 1);
                score += secondScore;
            } else {
                finalStack.append(c);
            }
        }
        
        return score;
    }
}