package algorithm;

import java.util.Arrays;

public class AngryProfessor {

	public static void main(String[] args) {
		int k = 3;
		int[] students = {-1, -3, 4, 2};
		
		int k2 = 2;
		int[] students2 = {0, -1, 2, 1};
		
		boolean res = isProfessorAngry(k2, students2);
		System.out.println(res);
	}
	
    public static boolean isProfessorAngry(int k, int[] students) {
    	
    	Arrays.sort(students);
    	int present = 0;
    	
    	for (int i = 0; i < students.length; i++) {
    		if (students[i] > 0) {
    			break;
    		}
			present++;
    	}
    	
    	return present >= k;
    }

}
