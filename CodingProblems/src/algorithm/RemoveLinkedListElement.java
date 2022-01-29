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
		
		while (res != null) {
			System.out.print(res.val + ", ");
			res = res.next;
		}
	}
  
    public static ListNode removeElements(ListNode head, int val) {
    	ListNode res = null;
    	ListNode node = null;
    	
    	while (head != null) {
    		if (head.val == val) {
    			head = head.next;
    			continue;
    		}
    		if (node == null) {
    			node = new ListNode(head.val);
    			res = node;
    		} else {
        		node.next = new ListNode(head.val);
        		node = node.next;
    		}
    		head = head.next;
    	}
    	return res;
    }
}
