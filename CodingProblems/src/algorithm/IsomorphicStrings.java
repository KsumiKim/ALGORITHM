package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class IsomorphicStrings {
	
    public boolean isIsomorphic(String s, String t) {
    	List<List<Integer>> sIdxList = getCharacterIdxList(s);
    	List<List<Integer>> tIdxList = getCharacterIdxList(t);
    	
    	return sIdxList.equals(tIdxList);
    }
    
    private List<List<Integer>> getCharacterIdxList(String s) {
    	Map<Character, List<Integer>> map = new TreeMap<>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		List<Integer> list;
    		if (map.containsKey(s.charAt(i))) {
    			list = map.get(s.charAt(i));
    			list.add(i);
    		} else {
    			list = new ArrayList<>();
    			list.add(i);
    		}
    		map.put(s.charAt(i), list);
    	}
    	
    	return map.values().stream().collect(Collectors.toList());
    }
}
