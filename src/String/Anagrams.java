package String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	public List<String> anagrams(String[] strs) {
		HashMap<String, ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();  
		  for (String str : strs) {  
		    // create unique label for each string  
		    String key = this.createHash(str);  
		    // map the label to a list of anagrams  
		    ArrayList<String> res = hash.get(key);  
		    if (res==null) {  
		      res = new ArrayList<String>();  
		      hash.put(key, res);  
		    }  
		    res.add(str);  
		  }  
		  ArrayList<String> resSet = new ArrayList<String>();  
		  for (ArrayList<String> anagram : hash.values()) {  
		    // ignore strings without anagrams  
		    if (anagram.size()>1) resSet.addAll(anagram);  
		  }  
		  return resSet;  
		
    }
	
	//这个算法跟我有相同的想法但是我的问题是，java功力不够，算法功力不够。
	public String createHash(String str) {  
	  int[] hash = new int[26];  
	  for (int i=0; i<str.length(); ++i) {  
	    int index = (int)(str.charAt(i) - 'a');  
	    hash[index]++;  
	  }  
	  StringBuilder ss = new StringBuilder();  
	  for (int i=0; i<26; ++i) {  
	    if (hash[i]==0) continue;  
	    char c = (char)('a' + i);  
	    ss.append(c);  
	    ss.append(hash[i]);  
	  }  
	  return ss.toString();  
	}
	

}
