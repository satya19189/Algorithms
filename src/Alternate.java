
public class Alternate {
	public static void main(String[] args) {
		System.out.println(solution(104956));
	}
	
	public static int solution(int n) {
		int count =0;
		int flag =0;
		String str = n+"";
		for(int i =0;i<str.length();i++) {
			if(flag%2 ==0) {
				count = count+Integer.parseInt(str.charAt(i)+"");
			}
			else {
				count = count-Integer.parseInt(str.charAt(i)+"");
			}
			flag++;
		}
		return count;
	}

}
