package algorithm;

public class OddEvenLinkedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		

		ListNode head2 = new ListNode(2);
		head2.next = new ListNode(1);
		head2.next.next = new ListNode(3);
		head2.next.next.next = new ListNode(5);
		head2.next.next.next.next = new ListNode(6);
		head2.next.next.next.next.next = new ListNode(4);
		head2.next.next.next.next.next.next = new ListNode(7);
	
		ListNode res = oddEvenList(head2);
		
		while (res != null) {
			System.out.print(res.val + ", ");
			res = res.next;
		}
		
	}

    public static ListNode oddEvenList(ListNode head) {
    	ListNode original = head;
    	ListNode orgEven = null;
    	ListNode even = null;
    	
    	while (head.next != null && head.next.next != null) {
    		ListNode temp = head.next;
    		head.next = temp.next;
    		
    		if (even == null) {
    			orgEven = temp;		
    			even = temp;		
    		} else {
    			even.next = temp;
    			even = even.next;
    		}
    		head = head.next;
    	}
    	even.next = null;
    	head.next = orgEven;
    	return original;
    }
}
