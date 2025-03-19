// 34. Find First and Last Position of Element in Sorted Array?(lee)


import java.util.Arrays;

public class FirstAndLastindex {
    

    public static void main(String[] args) {
        int arr[] = {5,7,8,8,10};
        int target = 7;
        int[] out = binarySearch(arr, target);

        System.out.println(Arrays.toString(out));
    }

    static int[] binarySearch(int[] arr, int target) {

        int[] ans = {-1,-1};
        int start = search(arr, target, true);
        int end  = search(arr, target, false);

        ans[0] = start;
        ans[1]  = end;
        return ans;
    }


    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            // find the middle element
            // int mid = (start+end)/2;
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex)
                {
                    end = mid-1;
                }
                else{start = mid+1;}
            }

        }
        return ans;
    }



    // 540. Single Element in a Sorted Array
    public static int twoPointer(int[] arr)
    {
        int ans = -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {

            if(start < arr.length-1 && arr[start] == arr[start+1])
            {
                start = start+2;
            }else{return arr[start];}

            if(end>0 && arr[end] == arr[end-1])
            {
                end = end-2;
            }
            else{return arr[end];}

            
        }
        return  -1;
    }
}
