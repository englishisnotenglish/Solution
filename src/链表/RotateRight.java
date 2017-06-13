package Á´±í;

import java.util.ArrayList;

public class RotateRight {
	public ListNode rotateRight(ListNode head, int k) {
        // write your code here	
		ArrayList<ListNode> temp = new ArrayList<ListNode>();
		ListNode ln = head;
		while(ln != null) {
			temp.add(ln);
			ln = ln.next;
		}
		int len = temp.size();
		if(len == 0 ||k % len == 0)
			return head;
		for (int i = 0; i < len; i++) {
			int move = (i + k) % len;
			if(move == len - 1) {
				temp.get(i).next = null;
			}
			else if(move == 0){
				temp.get(i).next = temp.get(0);
				return temp.get(i);
			}
		}
		return head;
    }
	public static void main(String[] args) {
		RotateRight rl = new RotateRight();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(1);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		//rl.rotateRight(a, 1);
		System.out.println(rl.rotateRight(a, 1).next.next.val);
	}
}
