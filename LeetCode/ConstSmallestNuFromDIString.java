import java.util.Stack;

public class ConstSmallestNuFromDIString {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(smallestNumber(pattern));
    }

    public static String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder str = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n+1; i++) {
            stack.push(i);
            if (i == n+1 || pattern.charAt(i-1)=='I') {
                while (!stack.isEmpty()) {
                    str.append(stack.pop());
                }
            }
        }
        return str.toString();
    }
}

