package strings;

public class LengthOfLastWorld {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
	}
	
	public static int lengthOfLastWord(String s) {
		int count =0;
		for(int i =s.length()-1;i>=0;i--) {
			if(s.charAt(i) ==' ')
				break;
			count++;
		}
		return count;
    }

}
