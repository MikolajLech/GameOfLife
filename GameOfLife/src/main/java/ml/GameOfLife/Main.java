package ml.GameOfLife;

public class Main {
	public static void main(String[] args) {
//		boolean [][] board = {{false, false, false, false}, {false, true, true, false},
//				{false, true, true, false}, {false, false, false, false}};
//		boolean [][] board = {{false, false, false, false}, {false, true, true, true},
//				{false, false, false, false}, {false, false, false, false}};
//		boolean [][] board = {{false, true, true, true}, {false, true, true, true},
//				{false, false, true, false}, {false, false, false, false}};
//		boolean [][] board = {{false, true, false, true}, {false, true, true, false},
//				{true, false, true, false}, {true, true, false, false}};
		boolean [][] board = {{false, true, false, true, true}, {false, true, true, false, true},
//				{true, false, true, false, false}, {true, true, false, true, true},
				{true, true, false, false, true}};
		
		GameOfLife gameOfLife = new GameOfLife(board);
		Viewer view = new GameOfLifeViewer(gameOfLife);	 
        
		while(true) {
			for (int i=1; i<=5 ; i++)
				System.out.println("\n");
			view.prt();
			gameOfLife.updateGame();
			try {
			Thread.sleep(700);
			} 
			catch(InterruptedException e) {
			} 
		}
	}
}
 