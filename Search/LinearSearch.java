



public class LinearSearch {

    public static void main(String[] args) {
        int [] arr = {1,23,24,21,51,63,134,12,53,22,10};
        System.out.println(arr.length);
        System.out.println("10 is at index : "+(search(arr, 10)));

        String name = "rameshwar";
        char target ='a';
        boolean ans = search(name, target);
        System.out.println(ans);

        int out = searchInrange(arr,21,1,7);
        System.out.println(out);




        int min = findMin(arr);
        System.out.println(min);

        int max = findMax(arr);
        System.out.println(max);



        int[][] arrr={
            {23,1,3},
            {234,64,34,23,16,32},
            {6,7,4,97,45},
            {22,65}
        };

        int t = 7;
        System.out.println(search(arrr,t));

        int maxx = max2d(arrr);
        System.out.println(maxx);
    }

    private static int max2d(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    private static String search(int[][] arr,int target)
    {
        String index = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    index = ""+i+", "+j;
                }
            }
        }

        return index;
    }

    private static int findMax(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans<arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

    private static int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans>arr[i]) {
                ans=arr[i];
            }
        }
        return ans;
    }

    private static int searchInrange(int[] arr, int target, int start, int end) {
        int index=-1;
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        return index;
    }

    private static boolean search(String name, char target) {
        boolean ans = false;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                ans=true;
            }
        }

        return ans;
    }

    //search in the array: return the index if found
    // otherwise if not found return -1
    static int search(int[] arr,int data)
    {
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                index = i;
            }
        }
        return index;
    }
    
}