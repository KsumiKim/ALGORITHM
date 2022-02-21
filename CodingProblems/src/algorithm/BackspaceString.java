package algorithm;

public class BackspaceString {

	public static void main(String[] args) {
		String S = "e##e#o##oyof##q";
		String T = "e##e#fq##o##oyof##q";
		
		String S2 = "ab#c";
		String T2 = "ad#c";
		
		String S3 = "ab##";
		String T3 = "c#d#";
		
		String S4 = "a#c";
		String T4 = "b";
		
		BackspaceString bString = new BackspaceString();
		boolean res = bString.backspaceCompare2(S4, T4);
		System.out.println(res);
	}
	
    public boolean backspaceCompare(String S, String T) {
    	StringBuilder sbForS = new StringBuilder(S);
    	StringBuilder sbForT = new StringBuilder(T);
    	
    	while (sbForS.indexOf("#") != -1 || sbForT.indexOf("#") != -1) {
    		int idxS = sbForS.indexOf("#");
    		int idxT = sbForT.indexOf("#");
    		
    		if (idxS != -1) {
    			sbForS.deleteCharAt(idxS);
    			
    			if (idxS > 0 && sbForS.charAt(idxS - 1) > 0)
    				sbForS.deleteCharAt(idxS - 1);
    		}

    		if (idxT != -1) {
    			sbForT.deleteCharAt(idxT);
    			
    			if (idxT > 0 && sbForT.charAt(idxT - 1) > 0)
    				sbForT.deleteCharAt(idxT - 1);
    		}
    	}
    	
    	return sbForS.toString().contentEquals(sbForT.toString());
    }


    public boolean backspaceCompare2(String s, String t) {
    	String processedS = getStringInTextEditor(s);
    	String processedT = getStringInTextEditor(t);
    	
    	return processedS.equals(processedT);
    }
    
    private String getStringInTextEditor(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	int idx = sb.indexOf("#");
    	
    	while (idx >= 0) {

    		sb.deleteCharAt(idx);
    		if (idx > 0) {
    			sb.deleteCharAt(idx - 1);
    		}
    		idx = sb.indexOf("#");
    	}
    	
    	return sb.toString();
    }
}
