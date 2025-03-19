import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()]";
        System.out.println(isVal(s));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        if (map.get('(') != map.get(')') || map.get('[') != map.get(']') || map.get('{') != map.get('}')) {
            return false;
        }

        return true;
    }

    public static boolean isVal(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            } else {
                if (!stack.isEmpty()) {

                    char pre = stack.pop();
                    if (!check(pre, temp)) {
                        // stack.push(pre);
                        // stack.push(temp);
                        return false;
                    }
                }
                else{stack.push(temp);}

            }
        }
        return stack.isEmpty();

    }

    private static boolean check(char pre, char temp) {
        if (pre == '(' && temp == ')' || pre == '[' && temp == ']' || pre == '{' && temp == '}') {
            return true;
        }
        return false;
    }
}
