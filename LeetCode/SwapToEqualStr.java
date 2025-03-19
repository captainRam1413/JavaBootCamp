// 1790. Check if One String Swap Can Make Strings Equal

import java.util.ArrayList;

public class SwapToEqualStr {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dcba";
        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        // ArrayList slist = new ArrayList<>();
        // for (int i = 0; i < s1.length(); i++) {
        // String ch = ""+s1.charAt(i);
        // slist.add(ch);
        // }
        // for (int i = 0; i < s2.length(); i++) {
        // String ch = ""+s2.charAt(i);
        // if (!slist.contains(ch)) {
        // return false;
        // }
        // }
        // return true;
        // if (s1.equals(s2)) {
        // return true;
        // }
        // for (int i = 0; i < s1.length()-1; i++) {

        // for (int j = i + 1; j < s1.length(); j++) {
        // String temp = s1;
        // temp = swap(temp, i, j);
        // if (temp.equals(s2)) {
        // return true;
        // }
        // }
        // }
        // return false;

        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2)
            return false;
        if (s1.equals(s2))
            return true;
        int i = 0;
        int j = 0;
        int alag = 0;
        for (int k = 0; k < n1; k++) {
            char ch1 = s1.charAt(k);
            char ch2 = s2.charAt(k);
            if (ch1 != ch2) {
                alag++;
                if (alag > 2)
                    return false;
                else if (alag == 1) {
                    i = k;
                } else {
                    j = k;
                }
            }
        }
        if (s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i))
            return true;

        else
            return false;
    }

    private static String swap(String temp, int i, int j) {
        char[] arr = temp.toCharArray();
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        return new String(arr);
    }

}
