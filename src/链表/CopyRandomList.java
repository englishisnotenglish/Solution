package 链表;

import java.util.ArrayList;
import java.util.HashMap;

public class CopyRandomList {
	public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
		HashMap<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
		ArrayList<RandomListNode> nodes = new ArrayList<RandomListNode>();
		int index = 0;
		RandomListNode temp = head;
		while(temp != null) {
			int code = temp.hashCode();
			mapIndex.put(code, index++);
			nodes.add(new RandomListNode(temp.label));
			temp = temp.next;
		}
		temp = head;
		int len = nodes.size();
		for (int i = 0; i < len; i++) {
			RandomListNode nodeI = temp,
						randomNode = nodeI.random;
			String random = randomNode == null ? null : mapIndex.get(randomNode.hashCode()) + "";
			if(random == null)
				nodes.get(i).random = null;
			else
				nodes.get(i).random = nodes.get(Integer.parseInt(random));
			if(i == len -1) {
				nodes.get(i).next = null;
				break;
			}
			int next = mapIndex.get(nodeI.next.hashCode());
			nodes.get(i).next = nodes.get(next);
			temp = temp.next;
		}	
		return nodes.get(0);
    }
	
	public static void main(String[] args) {
		CopyRandomList cl = new CopyRandomList(); 
		RandomListNode a = new RandomListNode(-2);
		RandomListNode b = new RandomListNode(3);
		a.next = b;
		cl.copyRandomList(a);
	}
}
