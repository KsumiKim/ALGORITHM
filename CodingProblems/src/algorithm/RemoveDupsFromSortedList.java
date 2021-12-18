package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDupsFromSortedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		
		int[] arr = {-50,-50,-49,-48,-47,-47,-47,-46,-45,-43,-42,-41,-40,-40,-40,-40,-40,-40,-39,-38,-38,-38,-38,-37,-36,-35,-34,-34,-34,-33,-32,-31,-30,-28,-27,-26,-26,-26,-25,-25,-24,-24,-24,-22,-22,-21,-21,-21,-21,-21,-20,-19,-18,-18,-18,-17,-17,-17,-17,-17,-16,-16,-15,-14,-14,-14,-13,-13,-12,-12,-10,-10,-9,-8,-8,-7,-7,-6,-5,-4,-4,-4,-3,-1,1,2,2,3,4,5,6,6,7,8,8,9,9,10,10,10,11,11,12,12,13,13,13,14,14,14,15,16,17,17,18,20,21,22,22,22,23,23,25,26,28,29,29,29,30,31,31,32,33,34,34,34,36,36,37,37,38,38,38,39,40,40,40,41,42,42,43,43,44,44,45,45,45,46,47,47,47,47,48,49,49,49,50};
		
		ListNode node = buildListNode(arr);
		ListNode res = deleteDuplicates(node);
		while (res != null) {
			System.out.print(res.val + ", ");
			res = res.next;
		}
		
	}
	
    public static ListNode deleteDuplicates(ListNode head) {
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	while (head != null) {
    		map.put(head.val, map.getOrDefault(head.val, 0) + 1);
    		head = head.next;
    	}
    	
    	List<Integer> nodeValList = new ArrayList<>();
    	for (int key : map.keySet()) {
    		if (map.get(key) == 1) {
        		nodeValList.add(key);
    		}
    	}

    	Collections.sort(nodeValList);
    	ListNode res = null;
    	ListNode temp = null;
    	for (int n : nodeValList) {
    		if (res == null) {
    			temp = new ListNode(n);
    			res = temp;
    		} else {
    			temp.next = new ListNode(n);
    			temp = temp.next;
    		}
    	}
    	return res;
    }
    
    
    private static ListNode buildListNode(int[] arr) {
    	ListNode res = null;
    	ListNode temp = null;
    	
    	for (int n : arr) {
    		if (res == null) {
    			temp = new ListNode(n);
    			res = temp;
    		} else {
    			temp.next = new ListNode(n);
    			temp = temp.next;
    		}
    	}
    	return res;
    }
}
