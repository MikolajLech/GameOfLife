package ml.GameOfLife;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	List<Cell> mNeighbors = new ArrayList<Cell>();
	private boolean mIsAlive;
	private boolean mIfWillBeAlive;
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
	public void ifWillbeAlive() {
		int aliveNeighborsNum = howManyNeighborsAlive();
		if((mIsAlive && aliveNeighborsNum >= 2 && aliveNeighborsNum <= 3) || (!mIsAlive && aliveNeighborsNum == 3))  {
			mIfWillBeAlive = true;		
		}
		else
			mIfWillBeAlive = false;
	}
	private int howManyNeighborsAlive() {
		int howManyNeighborsAlive = 0;
		for(int i = 0; i < mNeighbors.size(); i++) {
			if(mNeighbors.get(i).getIsAlive() == true)
				howManyNeighborsAlive += 1;				
		}
		return howManyNeighborsAlive;
	}
	public boolean getIfWillBeAlive() {
		ifWillbeAlive();
		return mIfWillBeAlive;
	}
}
