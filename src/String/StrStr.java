package String;

public class StrStr {
	/**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
    	
        // write your code here
    	if(source == null || target == null){
    		return -1;
    	}
    	if(target.length() == 0){
            return 0;
        }
    	if(source.length() < target.length())
    		return -1;
    	if(source.length() == source.length()){
    		if(source.equals(target))
    			return 0;
    	}
    	int tLen = target.length(),
    		sLen = source.length();
    	int indexWord = 0,
    		start = 0;
    	for (int i = 0; i < sLen; i++) {
    		indexWord = source.charAt(i);
    		start = i + 1;
    		if(indexWord == target.charAt(0)){
    			if(tLen == 1)
    				return i;
    			for (int j = 1; j < tLen; j++) {
					if(source.charAt(start++) != target.charAt(j))
						break;
					else
						if(j == tLen - 1)
							return i;
				}
    			
    		}
		}
    	return -1;
    }
    public static void main(String[] args) {
    	StrStr an = new StrStr();
		System.out.println(an.strStr("abcde", "e"));
	}
	

}
