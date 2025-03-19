import java.util.*;

public class HappyString {
    public static void main(String[] args) {
        int n =3;
        int k =9;
        System.out.println(getHappyString(3, 9));

        List<String> happyString = new ArrayList<>();
        generateHappyString("", n, happyString);

        if (happyString.size() < k) {
            System.out.println("");
        }
        System.out.println(happyString.get(k - 1));
    }

    public static void generateHappyString(String current, int n, List<String> happyString) {
        if (current.length() == n) {
            happyString.add(current);
            return;
        }
        for (char ch : new char[] { 'a', 'b', 'c' }) {
            if (current.isEmpty() || current.charAt(current.length() - 1) != ch) {
                generateHappyString(current + ch, n, happyString);
            }
        }
    }

    public static String getHappyString(int n, int k) {
        List<String> happyString = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.offer("a");
        q.offer("b");
        q.offer("c");
        while (!q.isEmpty()) {
            String ss = q.poll();
            if (ss.length() == n) {
                happyString.add(ss);
                continue;
            }
            char s = ss.charAt(ss.length() - 1);
            if (s == 'a') {
                q.offer(ss + "b");
                q.offer(ss + "c");
            }
            if (s == 'b') {
                q.offer(ss + "a");
                q.offer(ss + "c");
            }
            if (s == 'c') {
                q.offer(ss + "a");
                q.offer(ss + "b");
            }
        }
        if (happyString.size() < k) {
            return "";
        }
        System.out.println(happyString);
        return happyString.get(k - 1);
    }

}
