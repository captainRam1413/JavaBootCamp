public class SumOfPowerOf3 {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(91));
    }

    public static boolean checkPowersOfThree(int n) {
        int i =n;
        while (i>0) {
            if (i%3 == 2) {
                return false;
            }
            i =i/3;
        }
        return true;
    }
}