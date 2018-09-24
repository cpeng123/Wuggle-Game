package lab9;

import java.awt.Color;
import java.util.LinkedList;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class sixPoint {

	public final static String[] array = {
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
	
	public static Grid nextPoint(Grid gp, int i){
		if(i==0) return gp.up();
		if(i==1) return gp.down();
		if(i==2) return gp.left();
		if(i==3) return gp.right();
		if(i==4) return gp.up().left();
		if(i==5) return gp.up().right();
		if(i==6) return gp.down().left();
		if(i==7) return gp.down().right();
		return gp;
		
	}
	

	/**
	 * extract the elements of the gridSet and make it to a string in the lowerCapital string
	 * @author chengpeng
	 *
	 */

	public static String lower(LinkedList<Grid> gridSet) {
		String  conbine = "";
		for(Grid gp:gridSet) {
			conbine = conbine + gp.getLetter().toLowerCase();
		}
		for (Grid gp:gridSet) {
		}
		return conbine;
	}
	/**
	 * change the order of the elements of gridSet to get a new string
	 * @author chengpeng
	 *
	 */
	
	public static String lower2(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==3) {
			conbine = gridSet.get(0).getLetter() + gridSet.get(2).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower3(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==3) {
			conbine = gridSet.get(1).getLetter() + gridSet.get(2).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower4(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==3) {
			conbine = gridSet.get(1).getLetter() + gridSet.get(0).getLetter() + gridSet.get(2).getLetter();
		}
		return conbine;
	}
	public static String lower5(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==3) {
			conbine = gridSet.get(2).getLetter() + gridSet.get(1).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower6(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==3) {
			conbine = gridSet.get(2).getLetter() + gridSet.get(0).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower7(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(3).getLetter()+gridSet.get(2).getLetter() + gridSet.get(0).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower13(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(2).getLetter()+gridSet.get(3).getLetter() + gridSet.get(0).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower14(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(0).getLetter()+gridSet.get(2).getLetter() + gridSet.get(3).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower15(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(1).getLetter()+gridSet.get(2).getLetter() + gridSet.get(0).getLetter() + gridSet.get(3).getLetter();
		}
		return conbine;
	}
	public static String lower8(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(3).getLetter()+gridSet.get(0).getLetter() + gridSet.get(2).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower16(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(2).getLetter()+gridSet.get(0).getLetter() + gridSet.get(3).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower17(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(1).getLetter()+gridSet.get(0).getLetter() + gridSet.get(2).getLetter() + gridSet.get(3).getLetter();
		}
		return conbine;
	}
	public static String lower18(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(0).getLetter()+gridSet.get(3).getLetter() + gridSet.get(2).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower9(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(3).getLetter()+gridSet.get(1).getLetter() + gridSet.get(2).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower19(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(1).getLetter()+gridSet.get(3).getLetter() + gridSet.get(2).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower20(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(2).getLetter()+gridSet.get(1).getLetter() + gridSet.get(3).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower21(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(0).getLetter()+gridSet.get(1).getLetter() + gridSet.get(2).getLetter() + gridSet.get(3).getLetter();
		}
		return conbine;
	}
	public static String lower10(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(3).getLetter()+gridSet.get(1).getLetter() + gridSet.get(0).getLetter() + gridSet.get(2).getLetter();
		}
		return conbine;
	}
	public static String lower22(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(1).getLetter()+gridSet.get(3).getLetter() + gridSet.get(0).getLetter() + gridSet.get(2).getLetter();
		}
		return conbine;
	}
	public static String lower23(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(2).getLetter()+gridSet.get(1).getLetter() + gridSet.get(0).getLetter() + gridSet.get(3).getLetter();
		}
		return conbine;
	}
	public static String lower24(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(0).getLetter()+gridSet.get(1).getLetter() + gridSet.get(3).getLetter() + gridSet.get(2).getLetter();
		}
		return conbine;
	}
	public static String lower11(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(3).getLetter()+gridSet.get(2).getLetter() + gridSet.get(1).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower25(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(1).getLetter()+gridSet.get(2).getLetter() + gridSet.get(3).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower26(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(2).getLetter()+gridSet.get(3).getLetter() + gridSet.get(1).getLetter() + gridSet.get(0).getLetter();
		}
		return conbine;
	}
	public static String lower27(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(0).getLetter()+gridSet.get(2).getLetter() + gridSet.get(1).getLetter() + gridSet.get(3).getLetter();
		}
		return conbine;
	}
	public static String lower12(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(3).getLetter()+gridSet.get(2).getLetter() + gridSet.get(0).getLetter() + gridSet.get(1).getLetter();
		}
		return conbine;
	}
	public static String lower28(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(2).getLetter()+gridSet.get(0).getLetter() + gridSet.get(1).getLetter() + gridSet.get(3).getLetter();
		}
		return conbine;
	}
	public static String lower29(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(1).getLetter()+gridSet.get(0).getLetter() + gridSet.get(3).getLetter() + gridSet.get(2).getLetter();
		}
		return conbine;
	}
	public static String lower30(LinkedList<Grid> gridSet) {
		String  conbine = "";
		if(gridSet.size()==4) {
			conbine = gridSet.get(0).getLetter()+gridSet.get(3).getLetter() + gridSet.get(1).getLetter() + gridSet.get(2).getLetter();
		}
		return conbine;
	}

	
	/**
	 * check the word for length 3
	 * @author chengpeng
	 *
	 */	
	
	

	// check the word for length 3
	public static LinkedList<Grid> check3(Grid gp,String word){
		LinkedList<Grid> gridSet = new LinkedList<Grid>();
		gridSet.add(gp);
		for (int i=0; i<=7; i++) {
			Grid gp2=nextPoint(gp,i);
			gridSet.add(gp2);
			for (int j=0; j<=7; j++) {
				Grid gp3 = nextPoint(gp2,j);
				gridSet.add(gp3);
				boolean condition = true;
				for(int x=0; x<gridSet.size()-1; x++) {
					for (int y=x+1; y<gridSet.size();y++) {
						if (gridSet.get(x).equals(gridSet.get(y))){
							condition = false;
						}
					}

				}
				if(lower(gridSet).equals(word.toLowerCase()) && condition) {
					return gridSet;
				}
				if(lower2(gridSet).equals(word.toLowerCase()) && condition) {
					return gridSet;
				}
				if(lower3(gridSet).equals(word.toLowerCase()) && condition) {
					return gridSet;
				}
				if(lower4(gridSet).equals(word.toLowerCase()) && condition) {
					return gridSet;
				}
				if(lower5(gridSet).equals(word.toLowerCase()) && condition) {
					return gridSet;
				}
				if(lower6(gridSet).equals(word.toLowerCase()) && condition) {
					return gridSet;
				}
					gridSet.remove(2);
			}
			gridSet.remove(1);
		}
		return null;
	}
	/**
	 * check the word for length 4
	 * @author cheng
	 *
	 */	
	// check the word for length 4
	public static LinkedList<Grid> check4(Grid gp,String word){
	 LinkedList<Grid> gridSet = new LinkedList<Grid>();
	 gridSet.add(gp);
	 for(int i=0;i<=7;i++) {
		 Grid gp2=nextPoint(gp,i);
		 gridSet.add(gp2);
		 for (int j=0; j<=7; j++) {
			 Grid gp3=nextPoint(gp2,j);
			 gridSet.add(gp3);
			 for (int k=0; k<=7; k++) {
				 Grid gp4=nextPoint(gp3,k);
				 gridSet.add(gp4);
				 boolean condition = true;
				 for (int x=0; x<gridSet.size()-1; x++) {
					 for (int y=x+1; y<gridSet.size(); y++) {
						 if (gridSet.get(x).equals(gridSet.get(y))) {
							 condition = false;
						 }
					 }
				 }
				 if (condition&&lower(gridSet).equals(word)) {
					 return gridSet;
				 }
				 if(lower7(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower8(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower9(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower10(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower11(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower12(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower13(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower14(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower15(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower16(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower17(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower18(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower19(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower20(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower21(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower22(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower23(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower24(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower25(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower26(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower27(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower28(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower29(gridSet).equals(word.toLowerCase()) && condition) {
						return gridSet;
					}
					if(lower30(gridSet).equals(word.toLowerCase()) && condition) {
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
		/**
		 * Draw the board
		 * @author chengpeng
		 *
		 */	
		// TODO Auto-generated method stub
	
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
				Grid gp = new Grid(i,j);
				StdDraw.text(2*i+1, 2*j+1, gp.getLetter());
			}
		}
		
		
			
			ArgsProcessor.changeStdIn("datafiles/dictionary/shortwords.txt");
			String[] dictionary = StdIn.readStrings();
			/**
			 * check the word whether in dictionary and on the board
			 * @author chengpeng
			 *
			 */	
			while(true) {
				ArgsProcessor ap = new ArgsProcessor(args);
				String word1 = ap.nextString("Word?");
				String word = word1.toLowerCase();
				StdDraw.setPenColor(Color.BLACK);
				for (int i=0; i<4;i++) {
					for (int j=0; j<4;j++) {
						Grid gp = new Grid(i,j);
						StdDraw.text(2*i+1, 2*j+1, gp.getLetter());
					}
				}
				boolean a = false;
				for (int i=0; i < dictionary.length; i++) {
					if (word.equals(dictionary[i])) {
						a = true;
						break;
					}
				}
				
				while(!a) {
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.filledRectangle(4, 10, 4, 1);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.text(4, 10, "Not a word: "+ word);
					word = ap.nextString("Word?");
					 //check the input whether in the dictionary
					a = false;
					for (int i=0; i < dictionary.length; i++) {
						if (word.equals(dictionary[i])) {
							a = true;
							break;
						}
					}	
				}
			LinkedList<Grid> gridSet= new LinkedList<Grid>();
			 OUT:
             for (int i=0; i<4;i++) {
					 for(int j=0; j<4;j++) {
						 Grid gp=new Grid(i,j);
						 
							 gridSet=check3(gp,word);
							 if(gridSet!=null) {
								 for (Grid position: gridSet) {
									 StdDraw.setPenColor(Color.BLACK);
									 StdDraw.filledRectangle(4, 10, 4, 2);
									 StdDraw.setPenColor(Color.WHITE);
									 StdDraw.text(4, 10, "Found: "+ word);
									 StdDraw.setPenColor(Color.RED);
									 StdDraw.text(2*position.getRow()+1, 2*position.getCol()+1, position.getLetter());
								 }
								 break OUT;
							 }
							 
							 gridSet=check4(gp,word);
							 if(gridSet!=null) {
								 for (Grid position: gridSet) {
									 StdDraw.setPenColor(Color.BLACK);
									 StdDraw.filledRectangle(4, 10, 4, 2);
									 StdDraw.setPenColor(Color.WHITE);
									 StdDraw.text(4, 10, "Found: "+ word);
									 
									 StdDraw.setPenColor(Color.RED);
									 StdDraw.text(2*position.getRow()+1, 2*position.getCol()+1, position.getLetter());
								 }
								 break OUT;
							 } 
					 }
				}
				if (gridSet==null) {
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.filledRectangle(4, 10, 4, 2);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.text(4, 10, "Not found in grid: "+ word);
				}
			}
 }
			
		}
		
		
 



