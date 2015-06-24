package ml.GameOfLife;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	List<Cell> mNeighbors = new ArrayList<Cell>();
	private boolean mIsAlive;
	private boolean mWillBeAlive;
	Cell(boolean inBool) {
		mIsAlive = inBool;
	}
	public boolean getIsAlive() {
		return mIsAlive;	
	}
	public void addNeigbor(Cell neighbor) {
		if(neighbor != null)
			mNeighbors.add(neighbor);
	}
}
