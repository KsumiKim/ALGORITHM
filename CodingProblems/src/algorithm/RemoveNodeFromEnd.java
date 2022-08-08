package algorithm;

import java.util.ArrayList;
import java.util.List;

public class RemoveNodeFromEnd {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		int n = 2;
		

		ListNode head2 = new ListNode(1);
		int n2 = 1;

		ListNode head3 = new ListNode(1);
		head3.next = new ListNode(2);
		int n3 = 1;
		
		ListNode node = removeNthFromEnd(head, n);
	}
    
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		List<ListNode> list = new ArrayList<>();
		
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		
		list.remove(list.size() - n);
		ListNode temp = null;
		for (int i = 0; i < list.size(); i++) {
			if (temp == null) {
				temp = list.get(i);
				head = temp;
			} else {
				temp.next = list.get(i);
				temp = temp.next;
			}
		}
		temp.next = null;
    	return head;
    }
}
