package lab9;

import java.util.ArrayList;
import java.util.List;

public class WUggle {
	 private final String[][] grid;
	
	/**
	 * A WUggle game
	 * @param grid a 4x4 array of Strings.
	 * The string at row r, 0 <= r < 4 and column c, 0 <= c < 4
	 *   is stored at grid[r][c]
	 */
	 public WUggle(String[][] s) {
		 
	     this.grid = s;
		}
			
	/**
	 * 
	 * @param row the starting row of the String we seek
	 * @param col the starting column of the String we seek
	 * @param length the length of the String we seek
	 * @return the String of the supplied length that occurs in the grid horizontally, starting at the specified row and column
	 */
	 
	 
	 /**
	  * 
	  * @param find the position you'd like to locate it 
	  * @param the length is the part how many elements you want to extract in the horizontal direction
	  * @return the row you want to extract
	  */
	public String horizontalWordAtRow(GridPos gp, int length) {
		String s="";
		for (int i=gp.getCol(); i<gp.getCol()+length;i++) {
			s=s + this.grid[gp.getRow()][i];
		}
		
		return s; // FIXME
	}
	
	 /**
	  * 
	  * @param find the position you'd like to locate it 
	  * @param the length is the part how many elements you want to extract in the vertical direction 
	  * @return the column you want to extract
	  */


	public String verticalWordAtColumn(GridPos gp, int length) {
		String s="";
		for (int i=gp.getRow(); i<gp.getRow()+length;i++) {
			s=s + this.grid[i][gp.getCol()];
		}
		
		return s; // FIXME
	}

}
