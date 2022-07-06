package algorithm;

public class SortList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(4);
		
		ListNode res = sortList(head);
		
		while (res != null) {
			System.out.print(res.val + ", ");
		}
		
	}

    public static ListNode sortList(ListNode head) {
    	ListNode first = head;
    	boolean changed = true;
    	
    	while (changed) {
        	ListNode node = first;
    		boolean updated = false;
    		
        	while (node.next != null) {
        		if (node.val > node.next.val) {
        			int temp = node.val;
        			node.val = node.next.val;
        			node.next.val = temp;
        			updated = true;
        		}
        		node = node.next;
        	}
        	changed = updated;
    	}
    	return first;
    }
}
