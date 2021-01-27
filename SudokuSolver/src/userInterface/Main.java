package userInterface;

import java.awt.EventQueue;

import backtrackingAlgorithm.BTA;

public class Main {
	
	public static void main (String[] args) {
			
		Board board = new Board(
				new int[][] {{ 8, 0, 0, 0, 0, 0, 0, 0, 0 },
							{ 0, 0, 3, 6, 0, 0, 0, 0, 0 },
							{ 0, 7, 0, 0, 9, 0, 2, 0, 0 },
							{ 0, 5, 0, 0, 0, 7, 0, 0, 0 },
							{ 0, 0, 0, 0, 4, 5, 7, 0, 0 },
							{ 0, 0, 0, 1, 0, 0, 0, 3, 0 },
							{ 0, 0, 1, 0, 0, 0, 0, 6, 8 },
							{ 0, 0, 8, 5, 0, 0, 0, 1, 0 },
							{ 0, 9, 0, 0, 0, 0, 4, 0, 0 }});
	
		board.print();
		
		BTA backtrackingAlgorithm = new BTA();
		
		Board solvedBoard = new Board(backtrackingAlgorithm.solve(board));
		
		System.out.println("");
		
		solvedBoard.print();
		
		
		
		//Start of code for a graphical view of the sudoku board
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				GraphicView gw = new GraphicView();
				gw.setVisible(true);
			}
		});
		
	}
		
}
