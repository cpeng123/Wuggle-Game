package lab9;

import java.awt.Color;
import java.util.LinkedList;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class test {	
	// generate the random letters on the board
	public final static String[] point = {
			Dice.die00[(int)(Math.random()*6)],
			Dice.die01[(int)(Math.random()*6)],
			Dice.die02[(int)(Math.random()*6)],
			Dice.die03[(int)(Math.random()*6)],
			Dice.die04[(int)(Math.random()*6)],
			Dice.die05[(int)(Math.random()*6)],
			Dice.die06[(int)(Math.random()*6)],
			Dice.die07[(int)(Math.random()*6)],
			Dice.die09[(int)(Math.random()*6)],
			Dice.die10[(int)(Math.random()*6)],
			Dice.die11[(int)(Math.random()*6)],
			Dice.die12[(int)(Math.random()*6)],
			Dice.die13[(int)(Math.random()*6)],
			Dice.die14[(int)(Math.random()*6)],
			Dice.die15[(int)(Math.random()*6)]
			};
	
	//change the upper letter to the lower letter
	public static String lower(LinkedList<GridPos> gridSet) {
		String word = "";
		for(GridPos gp:gridSet) {
			word = word + gp.getLetter().toLowerCase();
		}
		return word;
	}
	
	//generate the neighboring points
	public static GridPos neighbor (GridPos gp, int n) {
		GridPos a = gp;
		if(n==0) a = gp.downNeighbor();
		if(n==1) a = gp.leftNeighbor();
		if(n==2) a = gp.rightNeighbor();
		if(n==3) a = gp.upNeighbor();
		if(n==4) a = gp.downLeft();
		if(n==5) a = gp.downRight();
		if(n==6) a = gp.upLeft();
		if(n==7) a = gp.upRight();
		return a;
	}
	
	
	
	//check the word for three letters
	public static LinkedList<GridPos> check3(GridPos gp, String input){
		LinkedList<GridPos> gridSet = new LinkedList <GridPos> ();
		gridSet.add(gp);
		for (int i=0; i<=7; i++) {
			GridPos gp2 = neighbor (gp,i);
			gridSet.add(gp2);
			for (int j = 0; j <= 7; j++) {
				GridPos gp3 = neighbor (gp2, j);
				gridSet.add(gp3);
				boolean condition = true;
				for(int x=0; x < gridSet.size() - 1; x++) {
					for (int y = i+1; y < gridSet.size(); y++) {
						if (gridSet.get(x).equals(gridSet.get(y))){
							condition = false;
						}
					}
				}
				if(lower(gridSet).equals(input)&&condition) {
					return gridSet;
				}
				//remove the third letter of the gridSet
				else {
					gridSet.remove(2);
				}
			}
			// remove the second letter of the gridSet
			gridSet.remove(1);
		}
		return null;
	}
	
	// check the word for 4 letters
	public static LinkedList<GridPos> check4(GridPos gp, String input){
		LinkedList<GridPos> gridSet = new LinkedList <GridPos> ();
		gridSet.add(gp);
		for (int i=0; i<=7; i++) {
			GridPos gp2 = neighbor (gp,i);
			gridSet.add(gp2);
			for (int j = 0; j <= 7; j++) {
				GridPos gp3 = neighbor (gp2,j);
				gridSet.add(gp3);
			for (int k = 0; k <= 7; k++) {
				GridPos gp4 = neighbor (gp3,k);
				gridSet.add(gp4);
				System.out.print(lower(gridSet));
				boolean condition = true;
				for(int x=0; x < gridSet.size() - 1; x++) {
					for (int y = i+1; y < gridSet.size(); y++) {
						if (gridSet.get(x).equals(gridSet.get(y))){
							condition = false;
						}
					}
				}
				if(lower(gridSet).equals(input)&&condition) {
					return gridSet;
				 }
				 gridSet.remove(3);
			 }
			 gridSet.remove(2);
		 }
		 gridSet.remove(1);
	 }
	 return null;
}
		
	public static void main(String[] args) {
		
		// Draw a board
		StdDraw.setYscale(0, 12);
		StdDraw.setXscale(0, 8);
		StdDraw.filledRectangle(4, 10, 4, 2);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.text(4, 10, "Welcome to WUggle");
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(4, 4, 4, 4);
		
		StdDraw.setPenColor(Color.BLACK);
		for (int i=0; i<4;i++) {
			for (int j=0; j<4;j++) {
				GridPos p = new GridPos(i,j);
				StdDraw.text(2*i+1, 2*j+1, p.getLetter());
			}
		}
		//input the word
		ArgsProcessor ap= new ArgsProcessor(args);
		String input = ap.nextString("Word?");
		// check the input whether in the dictionary
		ArgsProcessor.changeStdIn("datafiles/dictionary/shortwords.txt");
		String[] dictionary=StdIn.readStrings();
		boolean a = false;
		for (int i=0; i < dictionary.length; i++) {
			if (input.equals(dictionary[i])) {
				a = true;
				break;
			}
		}
		while(!a) {
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledRectangle(4, 10, 4, 1);
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.text(4, 10, "Not a word: "+ input);
			input = ap.nextString("Word?");
			 //check the input whether in the dictionary
			a = false;
			for (int i=0; i < dictionary.length; i++) {
				if (input.equals(dictionary[i])) {
					a = true;
					break;
				}
			}	
		}
		
			 LinkedList<GridPos> list= new LinkedList<GridPos>();
			 OUT:
			 for (int i=0; i<4;i++) {
				 for(int j=0; j<4;j++) {
					 GridPos p=new GridPos(i,j);
					     System.out.print(lower(list));
						 list=check3(p,input);

						 if(list!=null) {
							 for (GridPos po: list) {
								 StdDraw.setPenColor(Color.RED);
								 StdDraw.text(2*po.getRow()+1, 2*po.getCol()+1, po.getLetter());
							 }
							 break OUT;
						 }
					 
						 list=check4(p,input);
						 
						 if(list!=null) {
							 for (GridPos po: list) {
								 StdDraw.setPenColor(Color.RED);
								 StdDraw.text(2*po.getRow()+1, 2*po.getCol()+1, po.getLetter());
							 }
							 break OUT;
						 }	
				 }
			}
			if (list==null) {
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.filledRectangle(4, 10, 4, 2);
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.text(4, 10, "Not found in grid: "+ input);
			}			
		
	}
}
		
		
		

		
		
		
		
		
		
			
		
	
	
	
	


