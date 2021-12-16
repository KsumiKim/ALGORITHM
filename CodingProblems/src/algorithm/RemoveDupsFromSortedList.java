package algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupsFromSortedList {
	
    public ListNode deleteDuplicates(ListNode head) {
    	Set<Integer> set = new HashSet<>();
    	
    	while (head != null) {
    		set.add(head.val);
    		head = head.next;
    	}
    	
    	List<Integer> nodeValList = set.parallelStream().sorted().collect(Collectors.toList());
    	ListNode temp = null;
    	
    	for (int n : nodeValList) {
    		if (temp == null) {
        		temp = new ListNode(n);
    		} else {
    			temp.next = new ListNode(n);
    		}
    	}
    	return temp;
    }
}
