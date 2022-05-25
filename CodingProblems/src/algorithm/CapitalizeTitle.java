package algorithm;

public class CapitalizeTitle {
	
	public static void main(String[] args) {
		String title = "capiTalIze tHe titLe";
		String title2 = "First leTTeR of EACH Word";
		String title3 = "i lOve leetcode";
		
		String res = capitalizeTitle(title3);
		System.out.println(res);
	}

    public static String capitalizeTitle(String title) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (String word : title.split(" ")) {
    		if (word.length() > 2) {
    			sb.append(Character.toUpperCase(word.charAt(0)));
    			sb.append(word.substring(1).toLowerCase());
    		} else {
    			sb.append(word.toLowerCase());
    		}
			sb.append(" ");
    	}
    	return sb.toString().substring(0, sb.length() - 1);
    }
}
