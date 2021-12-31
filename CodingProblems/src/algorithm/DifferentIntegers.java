package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferentIntegers {
	
	public static void main(String[] args) {
		String word = "2393706880236110407059624696967828762752651982730115221690437821508229419410771541532394006597463715513741725852432559057224478815116557380260390432211227579663571046845842281704281749571110076974264971989893607137140456254346955633455446057823738757323149856858154529105301197388177242583658641529908583934918768953462557716z97438020429952944646288084173334701047574188936201324845149110176716130267041674438237608038734431519439828191344238609567530399189316846359766256507371240530620697102864238792350289978450509162697068948604722646739174590530336510475061521094503850598453536706982695212493902968251702853203929616930291257062173c79487281900662343830648295410";
		
		
		String word2 = "a123bc34d8ef34";
		String word3 = "leet1234code234";
		String word4 = "a1b01c001";
		String word5 = "kiwlvsvfi6v7s985r0h6s28p7fnl5oupx7wjwuhchinxobbs3cu9znbzw89tvye05a4fmarpha9653cqp6z5hp1n22ighbi6pedqtgldudc8njufv74x1dctkhkvlf57egb464sqj8pgibiibu7ootcfpi6vgjd733j4ehillylhacru9v02ozjgbcqdqaeb3evvmuibc46szvn5pfgzkxedpapndua36534bzhoxckksbotw5jux1bm2f1clvv7wzwbzdr0nycsmw8tb7v30cty4st6cdbvxi9x65jy5fifulqol0s8ol1n4gz7paqzd1g78osqa9i23suvbgxkphafnxdfyx7588esf36ti1ua48rdecqi4xd24vm4ysd50mhrzl3ji4upely8zdtb47lp3cv7ol0fy3h2";
		String word6 = "0i00e";
		int res = numDifferentIntegers2(word6);
		System.out.println(res);
	}
    
	public static int numDifferentIntegers(String word) {
		String num = word.replaceAll("[a-z]", " ");
		String[] numArr = num.split(" ");
		Set<String> set = new HashSet<>();
		
		for (String s : numArr) {
			if (s.isEmpty())
				continue;
			
			StringBuilder sb = new StringBuilder(s);
			while (sb.length() > 1 && sb.charAt(0) == '0')
				sb.deleteCharAt(0);
			set.add(sb.toString());
		}
		
		return set.size();
	}

	
	public static int numDifferentIntegersStream(String word) {
		String str = word.replaceAll("[a-z]+", "-");
		String[] splittedStr = str.split("-");
		
		return (int) Arrays.stream(splittedStr)
				.filter(x -> x.length() > 0)
				.map(x -> { 
					while(x.length() > 1 && x.startsWith("0")) {
						x = x.substring(1);
					}
					return x; 
				})
				.distinct()
				.count();
	}
}
