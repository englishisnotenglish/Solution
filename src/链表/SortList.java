package 链表;

import java.util.ArrayList;

public class SortList {
	public ListNode sortList(ListNode head) {  
        // write your code here
		ListNode temp = head;
		ArrayList<ListNode> nodes = new ArrayList<ListNode>();
		while(temp != null) {
			nodes.add(temp);
			temp = temp.next;
		}
		int len = nodes.size();
		ListNode swap;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if(nodes.get(i).val > nodes.get(j).val){
					swap = nodes.get(i);
					nodes.set(i, nodes.get(j));
					nodes.set(j, swap);
				}
			}
		}
		for (int i = 0; i < len; i++) {
			if(i == len -1){
				nodes.get(i).next = null;
				break;
			}
			nodes.get(i).next = nodes.get(i + 1);
		}
		return nodes.get(0);
	}
	
	public static void main(String[] args) {
		SortList sl = new SortList();
		ListNode a = new ListNode(5);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(3);
		ListNode e = new ListNode(1);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		System.out.println(sl.sortList(a).val);
	}
}
