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
		
		reorderList(head);
	}
	
    public static void reorderList(ListNode head) {
    	List<ListNode> list = new ArrayList<>();
    	
    	while (head != null) {
    		list.add(head);
    		head = head.next;
    	}
    	
    	for (int headIdx = 0; headIdx <= list.size() / 2; headIdx++) {
    		int tailIdx = list.size() - headIdx - 1;
    		
    		if (head == null) {
    			head = list.get(headIdx);
        		head.next = list.get(tailIdx);
    		} else {
    			head.next = list.get(headIdx);
    			if (tailIdx != headIdx) {
        			head.next.next = list.get(tailIdx);
    			}
    		}

    		head = head.next;
    	}
    	head.next = null;
    }
}
