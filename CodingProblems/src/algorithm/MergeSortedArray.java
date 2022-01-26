package algorithm;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		
		merge(nums1, m, nums2, n);
		
		for (int num : nums1)
			System.out.print(num + ", ");
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = 0, j = 0;
    	
    	while (i < nums1.length && j < nums2.length) {
    		
    		if (nums1[i] > nums2[j] || nums1[i] == 0) {
    			int temp = nums1[i];
    			nums1[i] = nums2[j];
    			nums2[j] = temp;
    			
    			if (temp == 0)
    				j++;
    		}
    		i++;
    	}
    }
}
