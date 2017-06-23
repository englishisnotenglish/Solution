package 查找;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LadderLength {
	public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
		if(start.equals(end)) return 1;
		
        Set<String> visited = new HashSet<String>();
        LinkedList<String> queue = new LinkedList<String>();
        
        queue.offer(start);
        dict.add(end);
        visited.add(start);
        int length = 1;
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	for (int i = 0; i < size; i++) {
        		String root = queue.poll(),
            			child;
            	Iterator<String> it = dict.iterator();
            	while(it.hasNext()) {
            		child = it.next();
            		if(compare(root, child)) {
            			queue.add(child);
            		}
            	}
            	if(compare(root, end)) 
            		return length + 1;
            	if(!visited.contains(root)) {
            		visited.add(root);
            	}
			}
        	
        	length++;
        }
        return 0;
    }
	
	public boolean compare(String a, String b) {
		int num = 0;
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) - b.charAt(i) != 0)
				num ++;
		}
		return num == 1 ? true : false;
	}
	
	public static void main(String[] args) {
		LadderLength ll = new LadderLength();
		String start = "qa";
		String end = "sq";
		Set<String> dict = new HashSet<String>();
		String[] strs = {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};
		for(String s : strs) {
			dict.add(s);
		}
		System.out.println(ll.ladderLength(start, end, dict));
	}
}
