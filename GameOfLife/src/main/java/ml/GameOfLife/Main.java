package ml.GameOfLife;

public class Main {
	public static void main(String[] args) {
		boolean [][] board = {{true, false, true}, {false, true, false}, {true, false, true}};
		GameOfLife gameOfLife = new GameOfLife(board);
		Viewer view = new GameOfLifeViewer(gameOfLife);	 
        
		while(true) {
			view.prt();
			gameOfLife.updateGame();
			try {
			Thread.sleep(500);
			} 
			catch(InterruptedException e) {
			} 
			for (int i=1; i<=10 ; i++)
			    System.out.println("\n");
//			System.out.println('\r');
		}
	}
}
 