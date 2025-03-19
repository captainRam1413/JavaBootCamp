import java.util.*;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        String str = "AAB";
        System.out.println(numTilePossibilities(str));
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.putIfAbsent(ch, 1);
            }
        }
        System.out.println(res(map));
    }

    private static int res(HashMap<Character, Integer> map) {
        int count = 0;
        for (char ch : map.keySet()) {
            int temp = map.get(ch);
            if (temp > 0) {
                map.replace(ch, temp - 1);
                count = 1 + res(map);
                map.replace(ch, temp);
            }
            

        }
        return count;
    }

    public static int numTilePossibilities(String tiles) {
        ArrayList<String> list = new ArrayList<>();
        int len = tiles.length();
        for (int i = 0; i < len; i++) {
            String temp = "" + tiles.charAt(i);
            if (!list.contains(temp)) {
                list.add(temp);
            }
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                int index = (j) % len;
                temp += "" + tiles.charAt(index);
                System.out.println("index :" + index + " char : " + tiles.charAt(index) + " temp:" + temp);
                if (!list.contains(temp)) {
                    list.add(temp);
                }
            }
        }
        System.out.println(list);
        return list.size();
    }
}
