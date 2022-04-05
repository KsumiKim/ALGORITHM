package algorithm;

public class MatrixRotation {

	public boolean findRotation(int[][] mat, int[][] target) {
		int columnIdx = getColumnIdxIfIdentical(mat, target[0]);
		int rowIdx = getRowIdxIfIdentical(mat, target[0]);
		
		if (columnIdx < 0 && rowIdx < 0) {
			return false;
		}
		
		boolean canBeIdentical = false;
		
		if (rowIdx == 0) {
			boolean rowIdentical = true;
			
			for (int i = 1; i < mat.length; i++) {
				
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] != target[i][i]) {
						rowIdentical = false;
					}
				}
			}
			canBeIdentical = rowIdentical;
		}
		
		if (!canBeIdentical && rowIdx == mat.length - 1) {
			boolean rowIdentical = true;
			
			for (int i = mat.length - 2; i >= 0; i--) {
				
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] != target[mat.length - i - 1][i]) {
						rowIdentical = false;
					}
				}
			}
			canBeIdentical = rowIdentical;
		}
		
		if (!canBeIdentical && columnIdx == 0) {
			boolean colIdentical = true;
			
			for (int i = 1; i < mat.length; i++) {
				
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[j][i] != target[i][i]) {
						colIdentical = false;
					}
				}
			}
			canBeIdentical = colIdentical;
		}
		
		if (!canBeIdentical && columnIdx == mat.length - 1) {
			boolean colIdentical = true;
			
			for (int i = mat.length - 2; i >= 0; i--) {
				
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] != target[mat.length - i - 1][i]) {
						colIdentical = false;
					}
				}
			}
			canBeIdentical = colIdentical;
		}
		
		return canBeIdentical;
    }
	
	private int getColumnIdxIfIdentical(int[][] mat, int[] row) {
		boolean leftIdentical = true, rightIdentical = true;
		
		
		for (int i = 0; i < mat.length; i++) {
			
			if (row[i] != mat[i][0]) {
				leftIdentical = false;
			}
			
			if (row[i] == mat[i][mat.length - 1]) {
				rightIdentical = false;
			}
			
		}
		return leftIdentical ? 0 : rightIdentical ? mat.length - 1 : -1;
	}
	
	private int getRowIdxIfIdentical(int[][] mat, int[] row) {
		boolean topIdentical = true, bottomIdentical = true;
		
		
		for (int i = 0; i < mat.length; i++) {
			
			if (row[i] != mat[0][i]) {
				topIdentical = false;
			}
			
			if (row[i] == mat[mat.length - 1][i]) {
				bottomIdentical = false;
			}
			
		}
		return topIdentical ? 0 : bottomIdentical ? mat.length - 1 : -1;
	}
}
