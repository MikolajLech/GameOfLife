package ml.GameOfLife;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class GameOfLife {
	private List<Cell> mCells = new ArrayList<Cell>();
	private BiMap<Coordinates, Cell> cellFinder = HashBiMap.create();
	GameOfLife(boolean[][] inBoard) {
		for(int i = 0; i < inBoard.length; i++) {
			for(int j = 0; j < inBoard[i].length; j++) {
				Cell newCell = new Cell(inBoard[i][j]);
				mCells.add(newCell);
				cellFinder.put(new Coordinates(i, j), newCell);
			}
		}
		addNeighbors();
	}
	public void addNeighbors() {
		for(int i = 0; i < mCells.size(); i++) {
			BiMap<Cell, Coordinates> cellToCoordinate = cellFinder.inverse();
			int CoordX = cellToCoordinate.get(mCells.get(i)).getX();
			int CoordY = cellToCoordinate.get(mCells.get(i)).getY();
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX-1, CoordY-1)));
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX-1, CoordY)));
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX-1, CoordY+1)));
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX, CoordY-1)));
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX, CoordY+1)));
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX+1, CoordY-1)));
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX+1, CoordY)));
			mCells.get(i).addNeighbor(cellFinder.get(new Coordinates(CoordX+1, CoordY+1)));
		}
	}
	public Cell getCell(int x, int y) {
		return cellFinder.get(new Coordinates(x, y));
	}
	public void updateGame() {
		for(Cell cell : mCells) {
			cell.evalIfWillBeAlive();
		}		
		for(Cell cell : mCells) {
			cell.changeIsAliveToIfWillBeAlive();
		}		
	}
}
