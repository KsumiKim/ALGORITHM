package algorithm;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFromSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		
		ListNode node = deleteDuplicates(head);
		
	}
	
    public static ListNode deleteDuplicates(ListNode head) {
    	Set<ListNode> set = new HashSet<>();
    	
    	while (head != null) {
    		set.add(head);
    	}
    	
    	for (ListNode node : set) {
    		if (head == null) {
    			head = node;
    		} else {
    			head.next = node;
    			head = head.next;
    		}
    	}
    	
    	head.next = null;
    	return head;
    }

}
