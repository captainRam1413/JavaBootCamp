package LeetCode;

import java.util.ArrayList;

public class CleanDigits {
    public static void main(String[] args) {
        System.out.println(clearDigits("cb34"));
        System.out.println(clnStrn("cb34"));
    }

    public static String clearDigits(String s) {
        String ss = "";
        char[] charr = s.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            char ch = charr[i];
            if (ch >= 48 && ch <= 57) {
                for (int j = i; j >= 0; j--) {
                    char chh = charr[j];
                    if (chh >= 97 && chh <= 122) {
                        charr[i] = '*';
                        charr[j] = '*';
                        break;
                    }
                }
            }
        }
        for (char ch : charr) {
            if(ch !='*')
            {
                ss +=ch;
            }
        }
        return ss;
    }

    public static String clnStrn(String s)
    {
        int i=-1;
        StringBuilder str = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch>='a' && ch<='z') {
                i++;
                str.append(ch);
            }
            else
            {
                if (i>=0) {
                    str.deleteCharAt(i);
                    i--;
                }
            }
        }
        return str.toString();
    }
}
