package algorithm;

public class ValidSudoku {
	
	public static void main(String[] args) {
		String[][] board = {{"8","3",".",".","7",".",".",".","."}
						,{"6",".",".","1","9","5",".",".","."}
						,{".","9","8",".",".",".",".","6","."}
						,{"8",".",".",".","6",".",".",".","3"}
						,{"4",".",".","8",".","3",".",".","1"}
						,{"7",".",".",".","2",".",".",".","6"}
						,{".","6",".",".",".",".","2","8","."}
						,{".",".",".","4","1","9",".",".","5"}
						,{".",".",".",".","8",".",".","7","9"}};
		
		boolean res = isValidSudoku(board);
		System.out.println(res);
	}

    public static boolean isValidSudoku(String[][] board) {
    	
    	// validating x-axis
    	for (int i = 0; i < board.length; i++) {
    		int[] nums = new int[9];
    		
    		for (int j = 0; j < board[i].length; j++) {
    			String value = board[i][j];
    			if (!value.matches("\\d")) {
    				continue;
    			}
    			
    			int cellNum = Integer.parseInt(value);
    			if (nums[cellNum - 1] > 0) {
    				return false;
    			}
    			nums[cellNum - 1]++;
    		}
    	}
    	
    	// validating y-axis
    	for (int i = 0; i < board[0].length; i++) {
    		int[] nums = new int[9];
    		
    		for (int j = 0; j < board.length; j++) {
    			String value = board[j][i];
    			if (!value.matches("\\d")) {
    				continue;
    			}
    			
    			int cellNum = Integer.parseInt(value);
    			if (nums[cellNum - 1] > 0) {
    				return false;
    			}
    			nums[cellNum - 1]++;
    		}
    	}
    	
    	// validating sub-box grid
    	for (int row = 0; row < 6; row += 3) {
    		
    		for (int col = 0; col < 6; col += 3) {
    			int[] nums = new int[9];
        		
            	for (int i = row; i < row + 3; i++) {
            		
            		for (int j = col; j < col + 3; j++) {
            			String value = board[i][j];
            			if (!value.matches("\\d")) {
            				continue;
            			}
            			
            			int cellNum = Integer.parseInt(value);
            			if (nums[cellNum - 1] > 0) {
            				return false;
            			}
            			nums[cellNum - 1]++;
            		}
        		}
    		}
    	}
    	return true;
    }
}
