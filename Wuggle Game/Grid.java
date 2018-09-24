package lab9;

import java.util.LinkedList;

public class Grid {
	private final int row, col;
	private String letter;
	
	public Grid(int row, int col) {
		
		this.row = row;
		this.col = col;
		this.letter = "";
	
	}
	/**
	 * find the element right to the current one
	 * @return
	 * return the element which you find
	 */
	public Grid right() {
		Grid gp= new Grid(this.row, this.col+1);
		return gp;
	}
	/**
	 * find the element down to the current one
	 * @return
	 * return the element which you find
	 */
	public Grid down() {
		Grid gp= new Grid(this.row-1, this.col);
		return gp;
	}
	/**
	 * find the element right to the current one
	 * @return
	 * return the element which you find
	 */
	public Grid up() {
		Grid gp= new Grid(this.row+1, this.col);
		return gp;
	}
	/**
	 * find the element left to the current one
	 * @return
	 * return the element which you find
	 */
	public Grid left() {
		Grid gp= new Grid(this.row, this.col-1);
		return gp;
	}
	/**
	 * find the letter
	 * @return
	 * return the element which you find
	 */
	public String getLetter() {
		if (col<0||row<0||col>3||row>3) {
			return "0";
		}
		this.letter = sixPoint.array[ 2 * col + row + 2 ];
		return this.letter;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
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
		Grid other = (Grid) obj;
		if (col != other.col)
			
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
	
	
}

