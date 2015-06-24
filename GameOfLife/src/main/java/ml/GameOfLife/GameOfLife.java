package ml.GameOfLife;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class GameOfLife {
	private List<List<Boolean>> golBoard = new ArrayList<List<Boolean>>(3);
	GameOfLife(boolean[][] inBoard) {
		for(int i = 0; i < inBoard.length; i++) {
			golBoard.add(new ArrayList<Boolean>());
			for(int j = 0; j < inBoard[i].length; j++) {
				golBoard.get(i).add(inBoard[i][j]);
			}
		}
//		for(boolean [] row : inBoard) {
//			List<boolean> newRow = Arrays.asList(row);
//			golBoard.add(newRow);
//		}
	}
	public Object getCell(int x, int y) {
		return golBoard.get(x).get(y);
	}
}
