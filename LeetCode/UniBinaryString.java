import java.util.*;

public class UniBinaryString {
    static String val = "";

    public static void main(String[] args) {
        String[] nums = {"111","011","001"};
        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        getBinaryString(set, n, "");
        return val;


        // StringBuilder ans = new StringBuilder();
        // for (int i=0;i<nums.length;i++){
        //     ans.append(nums[i].charAt(i) == '0' ? '1' :'0');
        // }
        // return ans.toString();

    }

    public static boolean getBinaryString(Set<String> set, int n, String string) {
        if (string.length() == n) {
            if (!set.contains(string)) {
                val = string;
                return true;
            }
            return false;
        }

        if (getBinaryString(set, n, string+'0')) {
            return true;
        }
        if (getBinaryString(set, n, string+'1')) {
            return true;
        }
        return false;
    }
}
