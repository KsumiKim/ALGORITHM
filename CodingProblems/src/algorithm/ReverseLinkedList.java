package algorithm;

import java.util.Stack;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		
		ListNode node = reverseList2(head);
		
		while (node != null) {
			System.out.print(node.val + ", ");
			node = node.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		ListNode result = stack.isEmpty() ? null : stack.peek();
		ListNode node = null;
		while (!stack.isEmpty()) {
			ListNode popped = stack.pop();
			popped.next = null;
			
			if (node == null) {
				node = popped;
			} else {
				node.next = popped;
				node = node.next;
			}
		}
		return result;
    }
	
	public static ListNode reverseList2(ListNode head) {
		ListNode node = null;
				
		while (head != null) {
			ListNode temp = head.next;
			head.next = node;
			node = head;
			head = temp;
		}
		return node;
    }
}
