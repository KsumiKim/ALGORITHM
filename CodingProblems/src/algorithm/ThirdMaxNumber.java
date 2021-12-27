package algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 2};
		int[] num2 = {1, 2};
		int[] num3 = {3, 2, 1};
		System.out.println(thirdMax(num));
	}
	
	public static int getThirdMaxNumber(int[] numbers) {
		
		HashSet<Integer> set = new HashSet<>();
		int max = Integer.MIN_VALUE;
		
		// if the given array has less than three numbers: return the max of array
		for (int n : numbers)
			if (n > max)
				max = n;
		
		// else: find the third max number in the array
		int round = 3;
		
		while (round > 0) {
			
			for (int n : numbers) {
				
				if (n > max && !set.contains(n))
					max = n;
			}
			if (set.size() == 2)
				break;
			
			set.add(max);
			
			round--;
			max = Integer.MIN_VALUE;
		}
		return max;
	}

    public static int thirdMax(int[] nums) {
    	
    	Set<Integer> set = new HashSet<>();
    	for (int n : nums) {
    		set.add(n);
    	}
    	
    	List<Integer> sortedUniqueList = set.stream().sorted().collect(Collectors.toList());
    	return sortedUniqueList.size() > 3 ? sortedUniqueList.get(sortedUniqueList.size() - 3) : ( sortedUniqueList.size() == 3 ? sortedUniqueList.get(0) : sortedUniqueList.get(sortedUniqueList.size() - 1) );
    }
}
