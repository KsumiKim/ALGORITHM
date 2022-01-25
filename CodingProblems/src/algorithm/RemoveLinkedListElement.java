package algorithm;

public class RemoveLinkedListElement {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		int val = 6;
		
		ListNode head2 = new ListNode(7);
		head2.next = new ListNode(7);
		head2.next.next = new ListNode(7);
		head2.next.next.next = new ListNode(7);
		int val2 = 7;
		
		ListNode res = removeElements(head2, val2);
		System.out.println(res);
	}
	
    public static ListNode removeElements(ListNode head, int val) {
    	ListNode prev = null;
    	
    	while (head != null) {
    		if (head.val == val) {
    			if (prev == null) {
    				head = head.next;
    			} else {
        			prev.next = head.next;
        			head = prev.next;
    			}
    			continue;
    		}
    		
    		if (prev == null) {
    			prev = head;
    		} else {
    			prev = prev.next;
    		}
    		head = head.next;
    	}
    	return head;
    }
}
