package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {

	public static void main(String[] args) {
		List<List<Integer>> contests = Arrays.asList(
				Arrays.asList(5, 1), 
				Arrays.asList(2, 1),
				Arrays.asList(1, 1),
				Arrays.asList(8, 1),
				Arrays.asList(10, 0),
				Arrays.asList(5, 0)
			);
		int k = 6;
		
		int res = luckBalance(k, contests);
		System.out.println(res);
	}
	
    public static int luckBalance(int k, List<List<Integer>> contests) {
    	int importantContestCount = 0, maxLuck = 0;
    	
    	for (List<Integer> contest : contests) {
    		importantContestCount += contest.get(1);
    		maxLuck += contest.get(0);
    	}
    	
    	int loseContestCount = importantContestCount - k;
		List<List<Integer>> sortedContests = contests.stream().filter(a -> a.get(1) == 1).collect(Collectors.toList());
		sortedContests.sort((a, b) -> a.get(0) - b.get(0));

		int idx = 0;
		while (loseContestCount-- > 0) {
			List<Integer> contest = sortedContests.get(idx);
			maxLuck -= contest.get(0);
		}
    	return maxLuck;
    }

}
