public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "babad";
        String str2 = "cbbd";
        String str3 = "cc";
        String str4 = "a";
        // System.out.println(checkPal(str));
        // System.out.println(longPalS(str));
        // System.out.println(longPalS(str2));
        System.out.println(longPalS(str3));
        // System.out.println(longPalS(str4));
    }

    public static String longPal(String str)
    {
        String maxStr = "";
        String tempStr = ""+str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            String temp = tempStr;
            temp +=str.charAt(i);
            if (checkPal(temp)|| temp.length() == 1) {
                tempStr+=str.charAt(i);
            }
            else
            {
                if (tempStr.length()>maxStr.length()) {
                    maxStr = tempStr;
                }
                tempStr = ""+str.charAt(i);
            } 
        }
        if (tempStr.length()>=maxStr.length()) {
            return tempStr;
        }
        return maxStr;
    }

    public static String longPalS(String str)
    {
        String maxString="";
        String tempStr ="";
        if(str.length() == 1)
        {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                tempStr = str.substring(i+1, j);
                if (checkPal(tempStr)) {
                    if (tempStr.length()>maxString.length()) {
                        maxString=tempStr;
                    }
                }
            }
        }
        return maxString;
    }

    public static boolean checkPal(String str)
    {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt((str.length()-1)-i)) {
                return false;
            }
        }
        return true;
    }
}
