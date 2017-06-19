package 链表;

import java.util.ArrayList;

public class RotateRight {
	public ListNode rotateRight(ListNode head, int k) {
        // write your code here	
		ArrayList<ListNode> temp = new ArrayList<ListNode>();
		ArrayList<ListNode> temp2 = new ArrayList<ListNode>();
		ListNode ln = head;
		while(ln != null) {
			temp.add(ln);
			temp2.add(null);
			ln = ln.next;
		}
		int len = temp.size();
		if(len == 0 ||k % len == 0)
			return head;
		for (int i = 0; i < len; i++) {
			int move = (i + k) % len;
			temp2.set(move, temp.get(i));
		}
		for (int i = 0; i < len; i++) {
			if(i == len - 1) {
				temp2.get(i).next = null;
				break;
			}	
			temp2.get(i).next = temp2.get(i + 1);
		}
		return temp2.get(0);
    }
	
	public static void main(String[] args) {
		RotateRight rl = new RotateRight();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(2);
		ListNode d = new ListNode(3);
		ListNode e = new ListNode(2);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		//rl.rotateRight(a, 1);
		System.out.println(rl.rotateRight(a, 1).next.next.val);
	}
}
