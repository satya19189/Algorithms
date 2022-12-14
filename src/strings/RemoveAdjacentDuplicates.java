package strings;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbaca"));
	}
	
	public static String removeDuplicates(String s) {
		Stack<String> list = new Stack<String>();
		for(int i = s.length()-1;i>=0;i--) {
			list.add(s.charAt(i)+"");
		}
		s="";
		while(list.size() > 0) {
			String dum = list.pop();
			if(s.length() != 0) {
				int val = dum.charAt(0) - s.charAt(s.length()-1);
				if(val ==0) {
					System.out.println(val);
					s = s.substring(0,s.length()-1);
				}else {
					s= s+dum;
				}
			}else {
				s= s+dum;
			}
			
		}
		return s;
    }

}
