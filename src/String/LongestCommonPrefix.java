package String;

public class LongestCommonPrefix {
	/**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
    	if(strs.length == 0)
    		return "";
    	if(strs.length == 1)
    		return strs[0];
    	int len = strs[0].length();
    	for(String str : strs){
			if(str.length() < len)
				len = str.length();
    	} 	
    	int index = 0;
    	boolean isIn = false;
    	for (int i = 0; i < len; i++) {
    		char c = strs[0].charAt(i);
    		for(String str : strs){
    			if(str.charAt(i) != c) {
    				isIn = true;
    				index = i;
    			}
        	}
    		if(isIn)
    			break;
    		else
    			index = i + 1;
		}
    	return strs[0].substring(0, index);
    }
    
    public static void main(String[] args) {
    	LongestCommonPrefix lc = new LongestCommonPrefix();
    	String[] strs= {"a", "a"};
    	System.out.println(lc.longestCommonPrefix(strs));
	}

}
