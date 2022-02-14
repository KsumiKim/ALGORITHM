package algorithm;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		
		
		boolean res = isPalindrome(head2);
		System.out.println(res);
	}
	
    public static boolean isPalindrome(ListNode head) {
    	StringBuilder sb = new StringBuilder();
    	
    	while (head != null) {
    		sb.append(head.val);
    		head = head.next;
    	}
    	String temp = sb.toString();
    	sb.reverse();
    	return temp.equals(sb.toString());
    }
}
