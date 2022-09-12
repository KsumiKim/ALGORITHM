package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3}; 
		int[] nums2 = {2,4,6};
		
		List<List<Integer>> res = findDifference(nums1, nums2);
		System.out.println(res);
	}
	
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    	List<Integer> list1 = new ArrayList<>();
    	List<Integer> list2 = new ArrayList<>();
    	
    	getDifference(nums1, nums2, list1);
    	getDifference(nums2, nums1, list2);
    	
    	return Arrays.asList(list1, list2);
    }
    
    private static void getDifference(int[] nums1, int[] nums2, List<Integer> list) {
    	for (int n1 : nums1) {
    		boolean contains = false;
    		
    		for (int n2 : nums2) {
    			if (n1 == n2) {
    				contains = true;
    			}
    		}
    		if (!contains) {
    			list.add(n1);
    		}
    	}
    }

}
