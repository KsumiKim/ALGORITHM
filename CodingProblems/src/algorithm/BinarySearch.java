package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		
		int[] nums2 = {-1,0,3,5,9,12};
		int target2 = 2;
		
		int[] nums3 = {5};
		int target3 = 5;
		
		int[] nums4 = {5, 6};
		int target4 = 5;
		
		BinarySearch search = new BinarySearch();
		int n = search.search2(nums4, target4);
		System.out.println(n);
	}
	
    public int search(int[] nums, int target) {
     
    	int start = 0,
    		end = nums.length,
    		mid = (end - start) / 2;
    	
    	// 0 < mid < nums.length
    	while (mid > start && mid < end) {
    		
    		if (nums[mid] == target)
    			return mid;
    		
    		if (nums[mid] > target) {
    			end = mid;
    			mid = mid / 2;
    		}
    		else {
    			start = mid;
    			mid = mid + ((nums.length - mid) / 2);
    		}
    	}
    	
    	return -1;
    }

    
    public int search2(int[] nums, int target) {
    	int min = 0, max = nums.length, mid = nums.length / 2;
    
    	while (min < mid && max > mid) {
    		int curr = nums[mid]; 
    		if (curr == target) {
    			return mid;
    		}
    		
    		if (curr < target) {
    			min = mid;
    		} else {
    			max = mid;
    		}
    		mid = (mid / 2) + min;
    	}
    	
    	return -1;
    }
}
