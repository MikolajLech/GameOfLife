package ml.GameOfLife;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameOfLife {
	private List<Cell> mCells = new ArrayList<Cell>();
	private Map<Coordinates, Cell> cellFinder = new HashMap<Coordinates, Cell>();
	GameOfLife(boolean[][] inBoard) {
//		System.out.println(inBoard.length);
//		System.out.println(inBoard[0].length);
		
		for(int i = 0; i < inBoard.length; i++) {
			for(int j = 0; j < inBoard[i].length; j++) {
//				System.out.println("hello");
				Cell newCell = new Cell(inBoard[i][j]);
				mCells.add(newCell);
				cellFinder.put(new Coordinates(i, j), newCell);
			}
		}
	}
	public Cell getCell(int x, int y) {
		return cellFinder.get(new Coordinates(x, y));
	}
	public void updateGame() {
		
	}
}
