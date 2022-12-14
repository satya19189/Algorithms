
public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}, 2));
	}
	
	public static int removeDuplicates(int[] nums,int val) {
		int i =0,j =0;
		while(j<nums.length) {
			if(val != nums[j]){
				System.out.println(nums[j]);
				nums[i] = nums[j];
				i++;
			}
			j++;
		}
		
		return i;
    }

}
