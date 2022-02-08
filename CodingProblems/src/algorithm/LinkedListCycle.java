package algorithm;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = head.next;
		
		boolean res = hasCycle(head);
		System.out.println(res);
	}

    public static boolean hasCycle(ListNode head) {
    	List<ListNode> nodeList = new ArrayList<>();
    	ListNode temp = head;
    	
    	while (temp != null) {
    		
    		if (nodeList.contains(temp)) {
    			return true;
    		}
    		nodeList.add(temp);
    		temp = temp.next;
    	}
    	return false;
    }
}
