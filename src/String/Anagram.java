package String;
import java.util.HashMap;
import java.util.Iterator;

public class Anagram {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
		int sumS = s.length(),
			sumT = t.length();
		HashMap<String, Integer> mapS = new HashMap<String, Integer>(sumS);
		HashMap<String, Integer> mapT = new HashMap<String, Integer>(sumT);
		if(sumS != sumT){
			return false;
		}
		for (int i = 0; i < sumS; i++) {
			int sum = 0;
			try {
				sum = mapS.get(s.charAt(i) + "");
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(sum > 0){
				mapS.put(s.charAt(i) + "", ++sum);
			}else{
				mapS.put(s.charAt(i) + "", 1);
			}
		}
		for (int i = 0; i < sumT; i++) {
			int sum = 0;
			try {
				sum = mapT.get(t.charAt(i) + "");
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(sum > 0){
				mapT.put(t.charAt(i) + "", ++sum);
			}else{
				mapT.put(t.charAt(i) + "", 1);
			}
		}
		Iterator<String> iter1 = mapS.keySet().iterator();
		 
        while (iter1.hasNext()) {
            String m1Key = (String) iter1.next();
            if (!mapS.get(m1Key).equals(mapT.get(m1Key))) {
            	return false;
            }
        }
		return true;
		
    }
};