package algorithm;

public class ConcatenationArray {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 1};
		int[] nums2 = {1, 3, 2, 1};
		
		int[] res = getConcatenation(nums2);
		
		for (int n : res) {
			System.out.print(n + ", ");
		}
	}
	
	public static int[] getConcatenation(int[] nums) {
		int[] res = new int[nums.length * 2];
		
		for (int i = 0; i < res.length; i++) {
			res[i] = nums[i % nums.length];
		}
		return res;
    }

}
