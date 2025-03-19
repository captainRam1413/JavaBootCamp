public class CyclicSortedArray {
	public static void main(String args[])
	{
		int arr[] = { 23, 34, 45, 12, 17, 19 };
		int arr2[] ={4,0,1,2};
		int pivit = findPivit(arr2);
		System.out.println(pivit);
		int target = 0;
		if(target == arr2[pivit])
		{
			System.out.println("pivit is the target"+pivit);
		}
		else{
			int beforpivit = search(arr2, 0, pivit, target);
			if (beforpivit != -1) {
				System.out.println("target found "+beforpivit);
			}
			else{
				int afterpivit = search(arr2, pivit, arr2.length-1, target);
				if (afterpivit !=-1) {
					System.out.println("target found "+afterpivit);
				}
				else{
					System.out.println("target not found -1");
				}
			}
		}
	}


	public static int findPivit(int[] arr)
	{
		int start=0;
		int end = arr.length-1;
		int pivid =0;
		while (start<=end) {
			int mid = start+(end-start)/2;
			if (arr[mid]>arr[mid+1]) {
				pivid = mid;
				break;
			}
			else
			{
				start++;
			}
		}
		return pivid;
	}

	public static int search(int[] arr,int start,int end,int target)
	{
		while (start<=end) {
			int mid=start+(end-start)/2;
			if (arr[mid] > target) {
				end = mid-1;
			}
			else if(arr[mid]<target){
				start = mid+1;
			}
			else if (arr[mid]==target) {
				return mid;
			}
		}
		return -1;

	}
}