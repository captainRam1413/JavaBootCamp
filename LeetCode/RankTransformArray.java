import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RankTransformArray {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] rank= arrayRankTransform(arr);
        System.out.println(Arrays.toString(rank));
    }
    public static  int[] arrayRankTransform(int[] arr) {
        int[] rankArr = new int[arr.length];
        int[] temparr = arr.clone();
        Arrays.sort(temparr);
        Map<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(temparr[i]) == null) {
                map.put(temparr[i], (rank++));
            }

        }
        for (int i = 0; i < arr.length; i++) {
            rankArr[i]=map.get(arr[i]);
        }       
        return rankArr;
    }
}
