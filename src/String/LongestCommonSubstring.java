package String;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LongestCommonSubstring {
	
	private List<String> resSet = new ArrayList<String>();
	
	public int longestCommonSubstring(String A, String B) {
        // write your code here
		String longStr = "";
		if(A.length() < B.length()){
			this.split(A);
			longStr = B;
		}else {
			this.split(B);
			longStr = A;
		}
		
		Iterator<String> it = this.resSet.iterator();
		int length = 0;
		while(it.hasNext()){
		    String subStr = it.next();
		    System.out.println(subStr);
		    if(subStr.length() > length && longStr.indexOf(subStr) != -1){
		    	length = subStr.length();
		    }
		}
		return length;
    }
	
	public void split(String A){		
		String s = "";
		int len = A.length();
		for (int i = 0; i < len; i++) {
			s = A.substring(0, i+1);
			resSet.add(s);
			if(s.length() == 2 && s.length() == A.length()){
				resSet.add(s.substring(1));
			}
			if(s.length() > 2 && s.length() == A.length()){
				this.split(s.substring(1));;
			}
		}
	}
	
	public static void main(String[] args) {
		LongestCommonSubstring an = new LongestCommonSubstring();
		System.out.println(an.longestCommonSubstring("www.lintcode.com code", 
				"www.ninechapter.com code"));
	}
}
