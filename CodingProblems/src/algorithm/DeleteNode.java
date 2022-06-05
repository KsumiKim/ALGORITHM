package algorithm;

public class DeleteNode {
	
	public static void main(String[] args) {
		ListNode root = new ListNode(4);
		root.next = new ListNode(5);
		root.next.next = new ListNode(1);
		root.next.next.next = new ListNode(9);
		
		deleteNode(root.next);
		
		ListNode temp = root;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
	
    public static void deleteNode(ListNode node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}
