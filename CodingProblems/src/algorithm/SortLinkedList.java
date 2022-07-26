package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLinkedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		
		ListNode node = sortList(head);
		
		while (node != null) {
			System.out.print(node.val + ", ");
			node = node.next;
		}
	}
	
	public static ListNode sortList(ListNode head) {
		List<ListNode> nodes = new ArrayList<>();
		
		while (head != null) {
			nodes.add(head);
			head = head.next;
		}
		
		Collections.sort(nodes, (a, b) -> a.val - b.val);
		ListNode temp = null;
		
		for (int i = 0; i < nodes.size(); i++) {
			
			if (i == 0) {
				temp = nodes.get(i);	
				head = temp;
			} else {
				temp.next = nodes.get(i);
				temp = temp.next;
			}
		}
		temp.next = null;
    	return head;
    }

}
