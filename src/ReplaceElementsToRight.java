import java.util.Arrays;

//LC1299
public class ReplaceElementsToRight {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(replaceElements(new int[] {17,18,5,4,6,1})));
	}
	
	public static int[] replaceElements(int[] arr) {
		for(int i =0;i<arr.length-1;i++) {
			arr[i] =arr[i+1];
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]<arr[j])
					arr[i] = arr[j];
			}
		}
		arr[arr.length-1] = -1;
		return arr;
        
    }

}
