package algorithm;

public class InsertPosition {
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		
		int[] nums2 = {1, 3, 5, 6};
		int target2 = 2;
		
		int[] nums3 = {1, 3, 5, 6};
		int target3 = 7;
		
		int res = searchInsert(nums3, target3);
		System.out.println(res);
	}

    public static int searchInsert(int[] nums, int target) {
    	int min = 0, max = nums.length;
    	int position = 0;
    	
    	while (min < max) {
			int mid = (max - min) / 2  + min;
        	
    		if (target == nums[mid]) {
        		position = mid;
        		break;
        	}

        	if (min == mid) {
        		position = mid + 1;
        		break;
        	}
        	
        	if (max == mid) {
        		position = max + 1;
        		break;
        	}
        	
        	if (target > nums[mid]) {
        		min = mid;
        	} else {
        		max = mid;
        	}
    	}
    	return position;
    }
    
}
