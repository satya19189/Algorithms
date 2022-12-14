package strings;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		reverseString(new char[] {'H','a','n','n','a','h'});
	}
	
	public static void reverseString(char[] s) {
		for(int i =0;i<s.length/2;i++) {
			char c = s[i];
			s[i] = s[s.length-i-1];
			s[s.length-i-1] = c;
		}
		System.out.println(Arrays.toString(s));
        
    }

}
