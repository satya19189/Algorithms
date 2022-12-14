
public class BinarySearch {
	/*
	 * public static void main(String[] args) { System.out.println(search(new int[]
	 * {-1,0,3,5,9,12},9)); }
	 */
	
	int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 5 };
        int n = arr.length;
        int x = 5;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
	
	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int mid = low +(high-1)/2;
		while(low != high) {
			mid = low +(high-1)/2;
			if(nums[mid] == target)
				return mid;
			if(nums[mid]> target) {
				high = mid-1;
			}else {
				low = mid +1;
			}
		}
        return 0;
    }

}
