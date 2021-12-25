package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(3);
		head2.next.next.next = new ListNode(4);
		
		reorderList(head2);
		
		while (head2 != null) {
			System.out.print(head2.val + ", ");
			head2 = head2.next;
		}
	}
	
    public static void reorderList(ListNode head) {
    	List<ListNode> list = new ArrayList<>();
    	
    	while (head != null) {
    		list.add(head);
    		head = head.next;
    	}
    	
    	ListNode temp = null;
    	
    	for (int headIdx = 0; headIdx <= list.size() / 2; headIdx++) {
    		int tailIdx = list.size() - headIdx - 1;
    		
    		if (temp == null) {
    			temp = list.get(headIdx);
    			head = temp;
    			temp.next = list.get(tailIdx);
    		} else {
    			temp.next = list.get(headIdx);
    			if (tailIdx != headIdx) {
    				temp.next.next = list.get(tailIdx);
    				temp = temp.next;
    			}
    		}
    		temp = temp.next;
    	}
    	temp.next = null;
    }
}
