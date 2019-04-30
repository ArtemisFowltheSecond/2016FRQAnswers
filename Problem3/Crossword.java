package Problem3;

public class Crossword {
	
	private Square[][] puzzle;
	
	public Crossword(boolean[] [] blackSquares) {
		//Implemented in part b
		int counter = 0;
		this.puzzle = new Square[blackSquares.length][blackSquares[0].length];
		for (int r = 0; r < blackSquares.length; r++) {
			for (int c = 0; c < blackSquares[0].length; c++) {
				if (blackSquares[r][c] == true) {
					puzzle[r][c] = new Square(true, 0);
				} else {
					if(toBeLabeled(r,c,blackSquares) == true) {
						puzzle[r][c] = new Square(false, counter);
						counter ++;
					}
					if(toBeLabeled(r,c,blackSquares) == false) {
						puzzle[r][c] = new Square(false, 0);
					}
				}
			}
		}
	}
	
	private boolean toBeLabeled(int r, int c, boolean[] [] blackSquares) {
		//Implemented in part a
		//Returns true if the square at row r and column c should be labeled with a positive number; false otherwise
		//The square at row r, column c is black if blackSquares[r][c] is true
		
		if (blackSquares[r][c] == true) {
			return false;
		} else if ((blackSquares[r-1][c] == true) || (blackSquares[r][c-1]) == true) {
			return true;
		} else {	
		return false;
		}
	}
}
