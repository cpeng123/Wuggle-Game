package lab9;
import java.util.LinkedList;
/**
 * A class to represent a row and column of a WUggle board.
 * For our game, the indexes will go from 0 to 3 inclusively in each direction,
 * But for generality no need to check for that here.
 * 
 * You can generate most of the methods of this class automatically by eclipse based
 *   on the two provided instance variables: row and col.
 *   
 * @author roncytron
 *
 */

/**
 * 
 * @author chengpeng
 *
 */

public class GridPos{
	
	private final int row, col;
    private String letter;
    
	public GridPos(int row, int col) {
		this.row = row;
		this.col = col;
		this.letter = "";
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}
	
	public String getLetter() {
		if (col<0||col>3||row<0||row>3) {
			return "0";
		}
		this.letter = test.point[2*col + row];
		return this.letter;
	}
	
	
	/**
	 * find the element right to the current one
	 * @return
	 * return the element which you find
	 */
	

	public GridPos rightNeighbor() {
		GridPos gp = new GridPos(this.row,this.col + 1);
		return gp;
	}
	
	public GridPos downNeighbor() {
		GridPos gp = new GridPos(this.row+1,this.col);
		return gp;
	}
	
	public GridPos leftNeighbor() {
		GridPos gp = new GridPos(this.row, this.col - 1);
		return gp;
	}
	
	public GridPos upNeighbor() {
		GridPos gp = new GridPos (this.row - 1, this.col);
		return gp;
	}
	
	public GridPos upLeft() {
		GridPos gp = new GridPos (this.row - 1, this.col - 1);
		return gp;
	}
	
	public GridPos upRight() {
		GridPos gp = new GridPos (this.row - 1, this.col + 1);
		return gp;
	}
	
	public GridPos downLeft() {
		GridPos gp = new GridPos (row + 1, col - 1);
		return gp;
	}
	
	public GridPos downRight() {
		GridPos gp = new GridPos (row + 1, col + 1);
		return gp;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "GridPos [row =" + row + ", col = " + col + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + ((letter == null) ? 0 : letter.hashCode());
		result = prime * result + row;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GridPos other = (GridPos) obj;
		if (col != other.col)
			return false;
		if (letter == null) {
			if (other.letter != null)
				return false;
		} else if (!letter.equals(other.letter))
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	

	
	
	
	//
	// Add the constructor and other methods as needed
	//
	
	
}