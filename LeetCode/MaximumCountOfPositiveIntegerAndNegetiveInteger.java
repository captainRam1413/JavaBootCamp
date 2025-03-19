public class MaximumCountOfPositiveIntegerAndNegetiveInteger {
    public static void main(String[] args) {

        System.out.println(maximumCount(new int[] {-1764,-1562,-1226,-1216,-402,-386,-133,979,1227,1992}));
    }

    public static int maximumCount(int[] nums) {
        int posCount =0;
        int negCount =0;

        for (int i : nums) {
            if (i>0) {
                posCount++;
            }
            if (i<0) {
                negCount++;
            }
        }

        return Math.max(posCount, negCount);
    }
}
