package Á´±í;

import java.util.ArrayList;



public class ReorderList {
	public void reorderList(ListNode head) {  
        // write your code here
		ArrayList<ListNode> temp = new ArrayList<ListNode>();
		while(head != null) {
			temp.add(head);
			head = head.next;
		}	
		
		int len = temp.size(),
			half = len / 2;
		if(len <= 2)
			return;
		for (int i = 0; i < half; i++) {
			temp.get(i).next = temp.get(len - 1 - i);
			temp.get(len - 1 - i).next = temp.get(i + 1);
			if(i == half - 1)
				temp.get(i + 1).next = null;
		}
    }
	
	public static void main(String[] args) {
		ReorderList rl = new ReorderList();
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(-1);
		ListNode c = new ListNode(0);
		a.next = b;
		b.next = c;
		rl.reorderList(a);
	}
}
