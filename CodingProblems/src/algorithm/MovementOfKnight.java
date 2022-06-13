package algorithm;

public class MovementOfKnight {
	
	public static void main(String[] args) {
		String position = "c2";
		
		int res = getMaxMovingPosition(position);
		System.out.println(res);
	}
	
	public static int getMaxMovingPosition(String position) {
		int[] rows = {2, 2, -2, -2, 1, -1, 1, -1};
		int[] cols = {-1, 1, 1, -1, 2, -2, -2, 2};

		int row = position.charAt(0) - 'a';
		int col = position.charAt(1) - '1';
		int count = 0;
		
		for (int i = 0; i < rows.length; i++) {
			int updatedRow = rows[i] + row;
			int updatedCol = cols[i] + col;
			
			if (updatedRow >= 0 && updatedRow <= 7 && updatedCol >= 0 && updatedCol <= 7) {
				count++;
			}
		}
		return count;
	}
}
