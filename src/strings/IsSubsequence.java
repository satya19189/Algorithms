package strings;

public class IsSubsequence {
	public static void main(String[] args) {
		System.out.println(isSubsequence("c", "a"));
	}
	
	public static boolean isSubsequence(String s, String t) {
		int k =0, i =0;
        while(i<s.length() && k < t.length()) {
        	if(s.charAt(i) == t.charAt(k))
        		i++;
        	k++;
        }
        if(i == s.length())
        	return true;
		return false;
    }
	
	public static boolean isSubsequenceTwo(String s, String t) {
		int k =0, i =0;
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
