package userInterface;

public class Board {
	
	int[][] board;
	
	
	public Board(int[][] b) { 
		this.board = b;
	}
	
	public void print() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					System.out.print(". ");
				} else {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
	public int[][] getBoard() {
		return this.board;
	}
	
}
