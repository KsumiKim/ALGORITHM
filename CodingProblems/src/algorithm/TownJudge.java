package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TownJudge {

	public static void main(String[] args) {
		int N = 4;
		int[][] trust = {
				{1, 3},
				{1, 4},
				{2, 3},
				{2, 4},
				{4, 3}
				};
		
		int N2 = 3;
		int[][] trust2 = {
				{1, 3},
				{2, 3},
				{3, 1}
				};
		
		int N3 = 3;
		int[][] trust3 = {
				{1, 3},
				{2, 3}
				};
		
		int N4 = 2;
		int[][] trust4 = {
				{1, 2}
				};
		
		TownJudge townJudge = new TownJudge();
		int res = townJudge.getJudge(N4, trust4);
		System.out.println(res);
	}
	
    public int findJudge(int N, int[][] trust) {
    	if (trust.length < 1)
    		return N == 1 ? N : -1;
    	
    	int judge = 0;
    	Map<Integer, Integer> map = new HashMap<>();
    	Set<Integer> set = new HashSet<>();
    	
    	// #1. A judge trusts nobody 
    	for (int[] pair : trust)
    		set.add(pair[0]);
    	
    	for (int i = 1; i < N + 1; i++)
    		if (!set.contains(i))
    			judge = i;
    	
    	// #2. Everyone trusts the judge
    	for (int[] pair : trust) {
    		if (map.containsKey(pair[0]) && map.get(pair[0]) == judge)
    			continue;
    		map.put(pair[0], pair[1]);
    	}
    	
    	for (int key : map.keySet())
    		if (map.get(key) != judge)
    			judge = -1;
    	
    	return judge;
    }
    
    
    public int getJudge(int n, int[][] trust) {
        int[] arr = new int[10000];
        Set<Integer> set = new HashSet<>();
        
        for (int[] label : trust) {
        	set.add(label[1]);
        	arr[label[1]]++;
        	
        	if (arr[label[0]] > 0) {
        		set.remove(label[0]);
        	}
        }
        int res = set.toArray(new Integer[1])[0];
    	
    	return set.size() == 1 && arr[res] == trust.length ? res : -1;
    }
}
