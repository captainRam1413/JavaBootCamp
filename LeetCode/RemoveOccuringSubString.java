public class RemoveOccuringSubString {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("ax", "ax"));
    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i));
            str = check(str,part);
        }
        return str.toString();
    }

    public static StringBuilder check(StringBuilder str , String part)
    {
        int strlen = str.length();
        int partlen = part.length();
        if (strlen<partlen) {
            return str;
        }
        String sb = str.substring(strlen-partlen);
        if (sb.equals(part)) {
            str.delete(strlen-partlen, strlen);

        }
        return str;
    }
}
