class LargetSubset {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        String ss = "" + s.charAt(0);
        int temp = 0;
        for (int i = 0; i < ss.length(); i++) {
            boolean check = true;
            if (ss.length() == 0) {
                System.out.println("count " + count + " temp " + temp + " ss.length " + ss.length());
                ss += s.charAt(i);

                temp += 1;
                System.out.println("ss " + ss + "  s " + s.charAt(i));
                System.out.println(count + " " + temp);
                continue;
            }

            for (int j = 0; j < s.length(); j++) {

                if (ss.charAt(i) == s.charAt(j)) {

                    check = false;

                    break;
                }
            }
            if (check) {
                ss += s.charAt(i);
                temp += 1;
                System.out.println(count + " " + temp);
            } else {
                ss = "";
                if (temp >= count) {
                    count = temp;
                    temp = 0;
                    System.out.println(count + " elseif " + temp);
                }
                i -= 1;

            }
        }
        if (temp > count) {
            count = temp;
        }
        return count;
    }

    public static int lenth(String s) {
        int count = 0;
        int temp = 1;
        String ss = "" + s.charAt(0);
        for (int i = 0; i < s.length() - 1; i++) {
            boolean check = true;
            for (int j = i + 1; j < s.length(); j++) {
                for (int j2 = 0; j2 < ss.length(); j2++) {
                    if (s.charAt(i) != s.charAt(j2)) {
                        ss += "" + s.charAt(j);

                        temp += 1;
                    } else {
                        ss = "";
                        if (temp >= count) {
                            count = temp;
                            temp = 0;

                        }

                        break;
                    }
                }

            }

        }
        if (temp >= count) {
            count = temp;
            temp = 0;

        }
        return count;
    }
}