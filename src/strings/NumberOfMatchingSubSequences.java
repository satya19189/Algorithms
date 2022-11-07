package strings;

public class NumberOfMatchingSubSequences {
	
	public static void main(String[] args) {
		System.out.println(numMatchingSubseq("abcde", new String[] {"a","bb","acd","ace"}));
	}
	
	public static int numMatchingSubseq(String s, String[] words) {
		int count = 0;
		for(String str : words) {
			if(isSubSeq(str,s))
				count++;
		}
        
		return count;
    }
	
	public static boolean isSubSeq(String s, String t) {
		int i = 0, k = 0;
		while(i<s.length() && k < t.length()) {
			if(s.charAt(i) == t.charAt(k))
				i++;
			k++;
		}
		if(i == s.length())
			return true;
		return false;
	}
	
	

}
